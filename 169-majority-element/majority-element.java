class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int x = n/2;
        if(n == 1)
        return nums[0];
        for(int i = 0; i < n-1; i++){
            int c = 1;
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j])
                c++;

            }
            if(c > x)
            return nums[i];
        }
        return -1;
        
    }
}