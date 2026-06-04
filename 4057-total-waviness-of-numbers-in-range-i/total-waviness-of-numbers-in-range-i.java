class Solution {
    private int waviness ( long num){
         String s = String.valueOf(num);
    int n = s.length();

    if(n < 3) return 0;

    int count = 0;

    for(int i = 1; i < n - 1; i++){
        int prev = s.charAt(i - 1) - '0';
        int cur  = s.charAt(i) - '0';
        int next = s.charAt(i + 1) - '0';

        if(cur > prev && cur > next) count++; 
        else if(cur < prev && cur < next) count++; 
    }

    return count;
    }
    public int totalWaviness(int num1, int num2) {
        long ans = 0;

    for(long x = num1; x <= num2; x++){
        ans += waviness(x);
    }

    return (int)ans;

       
        
    }
}