class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int i1 = 0, i2 =0,i=0;
        StringBuilder ans = new StringBuilder();
        while(i1 != l1 && i2 != l2){
            if(i % 2 == 0){
            ans.append(word1.charAt(i1));
            i1++;

            }
            else {
                ans.append(word2.charAt(i2));
                i2++;
            }
            i++;
        }
        if(i1 != l1){
            ans.append(word1.substring(i1,l1));
        }
        else if(i2 != l2){
            ans.append(word2.substring(i2,l2));
        }
        return ans.toString();
        
    }
}