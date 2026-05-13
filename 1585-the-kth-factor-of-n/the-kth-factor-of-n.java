class Solution {
    public int kthFactor(int n, int k) {
        int [] fact = new int [n];
        fact[0] = 1;
        int x =1;
        for(int i = 2; i <= (n/2); i++){
            if(n%i == 0) fact[x++] = i;
        }
        if(x<n)
        fact[x] = n;
        if(k > n ||fact[k-1] == 0)
        return -1;
        return fact[k-1];
        
    }
}