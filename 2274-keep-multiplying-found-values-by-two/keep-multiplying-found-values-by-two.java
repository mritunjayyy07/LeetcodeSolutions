class Solution {
    static boolean isFound(int [] nums, int search)
    {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == search)
            {
                return true;
            }
            else if(nums[mid] > search)
            {
                right = mid-1;
            }
            else 
            left = mid+1;
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {

        while(isFound(nums,original))
        {
            original *=2;
            
        }
        return original;

        
    }
}