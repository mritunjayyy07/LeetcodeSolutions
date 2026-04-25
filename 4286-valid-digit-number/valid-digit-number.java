class Solution {
    public boolean validDigit(int n, int x) {
        int c =0;
        int s = 0;
        int d = n;
        while(n != 0){
            int r = n%10;
            if(r == x )
            c = 1;
            
            n = n/10;
            if(n == 0 && r == x){
                c = 0;
            }
        }
        if(c == 1) return true;
        return false;
        
    }
}