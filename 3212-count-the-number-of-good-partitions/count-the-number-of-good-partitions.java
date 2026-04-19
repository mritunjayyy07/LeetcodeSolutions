class Solution {
    final int MOD = 1000000007;
    public int numberOfGoodPartitions(int[] nums) {
        
        Map< Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], i);
        }
        int i = 0;
        int j = map.get(nums[0]);
        int n = nums.length;
        int res = 1;
        while(i < n){
            if(i > j){
                res = (res * 2) % MOD;
            }
            j = Math.max(j,map.get(nums[i]));
            i++;
        }
        return res;
    }
}