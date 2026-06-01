class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalcost = 0;
        if(cost.length == 1)
        return cost[0];
        for(int i = cost.length-1; i >=0; i--){
            //totalcost += (cost[i] + cost[i-1]);
              if ((cost.length - 1 - i) % 3 != 2) {
                totalcost += cost[i];
            }

        }
        return totalcost;
        
    }
}