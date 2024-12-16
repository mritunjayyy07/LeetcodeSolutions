class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int index=0,value=nums[0];
        for(int i=1;i<=k;i++)
        {
            int s=nums[0];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<s)
                {
                    s=nums[j];
                    index=j;
                    
                }

            }
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==s)
                {
                    s=nums[j];
                    index=j;
                    break;
                    
                }

            }
            nums[index]*=multiplier;

            

        }
        return nums;
        
    }
}