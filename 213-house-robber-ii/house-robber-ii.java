public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int max1 = linearRob(nums, 0, n - 2);
        int max2 = linearRob(nums, 1, n - 1);
        return Math.max(max1, max2);
    }
    
    private int linearRob(int[] nums, int start, int end) {
        if (start > end) return 0;
        
        int prevMax = 0;
        int currMax = 0;
        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(currMax, prevMax + nums[i]);
            prevMax = temp;
        }
        return currMax;
    }
}
