class Solution {
    public double calc(double x , long n){
        if(n == 0)
        return 1;
        if(n < 0)
        return calc((1/x),((-1)*n));
        if(n%2 == 1)
        return x*calc(x*x,(n-1)/2);
        else
        return calc(x*x,n/2);
    }
    public double myPow(double x, int n) {

        return calc(x,(long)n);
        
    }
}