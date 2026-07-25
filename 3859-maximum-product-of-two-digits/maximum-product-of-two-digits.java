class Solution {
    public int maxProduct(int n) {
        int d = n;
        int max = 0;
        int max_2 = 0;
        
        int c = 0;
        while(n != 0){
            int r = n % 10;
            max = Math.max(max,r);
            n = n /10;
        }
        while(d != 0){
            int r = d %10;
            if(r == max){
                c++;
            }
            if(r != max){
                max_2 = Math.max(max_2, r);
            }
            d = d/10;
        }
        if(c > 1)
        return max*max;
        return max*max_2;
        
    }
}