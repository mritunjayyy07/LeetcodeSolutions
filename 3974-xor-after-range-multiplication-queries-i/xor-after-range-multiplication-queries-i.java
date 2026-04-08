class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int ql = queries.length;
        int n = nums.length;
        int MOD = 1_000_000_007;
        for(int i = 0; i < ql; i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            int index = l;
            while(index <= r){
                nums[index] = (int)(((long)nums[index] * v) % MOD);
                index += k;
            }
            

        }
        int result = 0;
        for(int i : nums){
            result = result ^ i;
        }
        return result;
        
    }
}