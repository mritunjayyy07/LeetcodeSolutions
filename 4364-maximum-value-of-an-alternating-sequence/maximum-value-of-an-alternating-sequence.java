class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1)
        return s;
        long ans = s + (long)(n/2) * m;
        ans -= (n/2)- 1;        
        //return max;

        return ans;
        
    }
}