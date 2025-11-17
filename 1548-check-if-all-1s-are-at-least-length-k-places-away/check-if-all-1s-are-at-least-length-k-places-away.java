class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previndex = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1 && previndex == -1)
            {
                previndex = i;
                continue;
            }
            if(nums[i] == 1)
            {
                int diff = i - previndex-1;
                if(diff < k)
                return false;
                else
                previndex = i;
            }
        }
        
            
        
        return true;
        
    }
}