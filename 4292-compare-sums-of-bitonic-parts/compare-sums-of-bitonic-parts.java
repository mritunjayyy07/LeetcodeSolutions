class Solution {
    public int compareBitonicSums(int[] nums) {
        long sum1 = 0;
        long sum2 = 0;
        int c = -1;
        int l = nums.length;
        if(nums[0] > nums[1]){
            sum1 = nums[0];
            for(int i : nums) sum2 += i;
            if(sum1 > sum2) return 0;
            if(sum2 > sum1) return 1;
            return -1;

        }
        if(nums[l-1] > nums[l-2]){
            sum2 = nums[l-1];
            for(int i : nums) sum1 += i;
            if(sum1 > sum2) return 0;
            if(sum2 > sum1) return 1;
            return -1;
        }
        for(int i = 0; i < l-1; i++){
            sum1 += nums[i];
            if(nums[i] > nums[i+1]){
                c = i;
                break;
            }
            
        }
        for(int i = c; i < l; i++) sum2 += nums[i];
        System.out.println(sum1 + "  " + sum2);
        if(sum1 > sum2) return 0;
        if(sum2 > sum1) return 1;
        return -1;
        
    }
}