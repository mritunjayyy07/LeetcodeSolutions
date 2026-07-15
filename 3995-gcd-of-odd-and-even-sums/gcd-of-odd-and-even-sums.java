class Solution {
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int e = 2;
        int o = 1;
        int sume = 0, sumo = 0;
        for (int i = 1; i <=n; i++){
            sume += e;
            sumo += o;
            e+=2;
            o+=2;
        }
        // while(sumo != 0){
        //     int temp = sumo;
        //     sumo = sumo % sume;
        //     sume = temp;
        // }
        return gcd(sumo,sume);
        
    }
}