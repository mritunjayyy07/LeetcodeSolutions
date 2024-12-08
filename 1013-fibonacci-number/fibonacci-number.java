class Solution {
    public int fibo(int n)
    {
        int a = -1;
        int b = 1;
        int c = 0;
        for(int i = 0; i <= n;i++)
        {
            c= a+b;
            a=b;
            b=c;
        }
        return c;

    }
    public int fib(int n) {
        if(n == 0)
        return 0;
        if(n < 2)

        return 1;
        return fibo(n-2)+fibo(n-1);
        
        
        
    }
}