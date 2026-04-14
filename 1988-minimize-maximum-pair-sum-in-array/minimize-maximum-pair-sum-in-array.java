class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0; 
        int r = nums.length -1;
        int min = Integer.MIN_VALUE;
        while(l <= r){
            if(nums[l] + nums[r] > min)
            min = nums[l] + nums[r];
            r--;
            l++;

        }
        return min;
        
    }
}