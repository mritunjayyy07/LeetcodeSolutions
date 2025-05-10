class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
       for(int i = 0 ;i < nums.length-1; i++)
       {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[ i ] == nums[j] )
                count++;
            }
       }
       return count;
    }
}