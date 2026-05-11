class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> lst = new ArrayList<>();
        
        for(int i : nums){
            String s = String.valueOf(i);
            for(char ch : s.toCharArray()) lst.add(ch);

        }
        int [] ans = new int [lst.size()];
        int i = 0;
        for(char ch : lst){
            int x = ch - '0';
            ans[i++] = x;
        }
        return ans;
       

        
    }
}