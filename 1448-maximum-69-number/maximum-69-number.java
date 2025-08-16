class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        String ans = "";
        int c= 0;
        for(char ch : s.toCharArray() )
        {
            if(ch == '6' && c ==0)
            {
                c =1;
                ch = '9';
                ans = ans+ch;
                
            }
            else
            ans = ans + ch;
        }
        num = Integer.parseInt(ans);
        return num;
        
    }
}