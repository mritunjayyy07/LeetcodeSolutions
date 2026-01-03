class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
        return 0;
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right)
        {
            if(nums[left] > nums[left+1])
            return left;
            else
            left++;
            if(nums[right] > nums[right-1])
            return right;
            else
            right--;
            
        }
        return index;
        
    }
}