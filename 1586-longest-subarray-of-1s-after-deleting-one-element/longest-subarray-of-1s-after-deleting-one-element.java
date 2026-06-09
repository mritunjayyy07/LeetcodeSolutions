class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int zerocount = 0;
        int maxlen = 0;
        while(j < n){
            if(nums[j] == 0) zerocount++;
            while(zerocount > 1){
                if(nums[i] == 0)
                    zerocount--;
                i++;
            }
            maxlen = Math.max(maxlen, j-i);
            j++;
        }
        return maxlen;
        
    }
}