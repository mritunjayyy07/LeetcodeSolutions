class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
                int n1 = str1.length();
        int n2 = str2.length();
        int j = 0;

        for (int i = 0; i < n1 && j < n2; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            
            if (c1 == c2 || (c1 + 1 - 'a') % 26 + 'a' == c2) {
                j++;
            }
        }

        
        return j == n2;
        
    }
}