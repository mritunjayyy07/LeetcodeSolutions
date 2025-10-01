class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int temp = numBottles;
        while(numBottles >= numExchange)
        {
            ans += temp;
            temp = numBottles/numExchange;
            numBottles = (numBottles/numExchange) + (numBottles%numExchange);
             

        }
        System.out.println(numBottles + "  " + numExchange);
        if(ans == 0)
        return numBottles;
        else
        return ans+temp;
        
    }
}