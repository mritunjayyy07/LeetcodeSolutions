class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int answer = numBottles;
        int curremain = numBottles;

        while(curremain >= numExchange)
        {
            answer += 1;
            curremain = (curremain - numExchange) + 1;
            numExchange++;
            
        }
        return answer;
    }
}