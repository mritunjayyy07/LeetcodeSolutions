class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0; 
        int j = 0;
        int min = nums.length + 1;
        int n = nums.length;
        int sum = 0;
        while(j < n)
        {
            sum += nums[j];
            while(sum >= target)
            {
                min = Math.min(min , (j - i +1));
                sum -= nums[i];
                i++;
            }
            j++;

        }
        if(min > n)
        return 0;
        return min;
        
    }
}