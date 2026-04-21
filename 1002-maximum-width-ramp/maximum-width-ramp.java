class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int rm [] = new int [n];
        rm[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            rm[i] = Math.max(rm[i+1]  ,nums[i]);
        }
        int ramp = 0;
        int i = 0 ;
        int j = 0;
        while( j < n ) {
            while( i < j && nums[i] > rm [j]){
                i++;

            }
            ramp = Math.max(ramp, j-i);
            j++;

        }       
        return ramp;
    }
}