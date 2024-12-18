class Solution {
    public int[] finalPrices(int[] prices) {
        //int dis [] = new int [prices.length];
        for(int i = 0; i < prices.length-1; i++)
        {
            int c= 0;
            for(int j = i+1; j < prices.length; j++)
            {
                if(prices[j] <= prices[i])
                {
                    c = j;
                    break;
                }
                
                
            }
            if(c != 0)
                prices[i] -= prices[c];
        }
        return prices;
        
    }
}