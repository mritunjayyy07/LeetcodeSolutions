class Solution {
    public int maxDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i < nums.length-1; i++){
            int tempmax = 0;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] != nums[j]){
                    tempmax = j-i;
                }
            }
            if(tempmax > max){
                max = tempmax;
            }

        }
        return max;


        
    }
}