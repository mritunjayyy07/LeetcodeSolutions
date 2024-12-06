class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;
        int sum = 0 ;
        Map<Integer,Integer> map= new HashMap<>();

        for(int i = 0 ; i < banned.length;i++)
        {
            map.put(banned[i],1);
        }
        for(int i = 1; i <= n ; i++)
        {
            if (map.containsKey(i)) {
                continue;
            }

            if (sum + i <= maxSum) {
                sum += i;
                count++;
            } else {
                break;
            }
        }
        return count;
              
    }
}