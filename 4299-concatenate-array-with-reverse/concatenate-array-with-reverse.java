class Solution {
    public int[] concatWithReverse(int[] nums) {
        int [] ans = new int [2*nums.length];
        int x = 0;
        for(int i : nums) ans[x++] = i;
        for(int i = nums.length-1; i >= 0; i--) ans[x++] = nums[i];
        return ans;
        
    }
}