class Solution {
    public int reverse(int x) {
        
        int res = 0;
        int n = x;
        while(x != 0)
        {
            int r = x %10;
            int newRes = res*10 + r;
            if((newRes-r)/10 != res)
            {
                return 0;
            }
            res = newRes;
            x/=10;
        }
       
        return res;
    }
}