class Solution {
    private boolean pf (int num){
    
    if (num < 0) return false;
    int sqrt = (int) Math.sqrt(num);
    return (sqrt * sqrt == num);
}

    
    public boolean judgeSquareSum(int c) {
        int end = 0;
        int x = (int) Math.sqrt(c);
        for(int i = 0; i <= x; i++){
            int temp = c-(i*i);
            if(pf(temp)){
                return true;
            }
        }
        return false;
        
        
    }
}