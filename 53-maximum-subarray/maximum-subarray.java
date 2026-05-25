class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int mxsum = Integer.MIN_VALUE;
        for(int i : nums){
            sum += i;
            mxsum = Math.max(mxsum,sum);
            if(sum < 0) sum = 0;

        }
        return mxsum;
        
    }
}