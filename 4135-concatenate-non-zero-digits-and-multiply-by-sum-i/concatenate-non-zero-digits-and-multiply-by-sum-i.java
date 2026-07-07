class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        String temp = "";
        int sum = 0;
        if(n == 0) return 0;
        for(char ch : s.toCharArray()){
            if(ch != '0')
            temp = temp + ch;
            int x = ch - 48;
            sum += x;



        }
        int y = Integer.parseInt(temp);
       long ans = (long)y * sum;
        return ans;


        
    }
}