class Solution {
    public boolean check(int[] nums) {
        int count=0,n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)% nums.length] && ++count>1)return false;
        }
    return count<=1;
     }}