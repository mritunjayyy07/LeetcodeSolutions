class Solution {
    public void sortColors(int[] nums) {
        int i = 0 ;
        int j = 0;
        int k = nums.length-1;
        while(j<=k)
        {
            switch(nums[j])
            {
                case 0:
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;j++;
                break;
                case 1:
                j++;
                break;
                case 2:

                 t = nums[j];
                nums[j] = nums[k];
                nums[k] = t;
                k--;
            }
        }
        
    }
}