class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
        return 0; 
    }

    int lowest = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < lowest) {
            lowest = prices[i]; 
        } else {
            maxProfit = Math.max(maxProfit, prices[i] - lowest); 
        }
    }

    return maxProfit;
        
    }
}