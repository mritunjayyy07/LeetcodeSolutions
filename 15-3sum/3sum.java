class Solution {
    public void twosum(int [] nums, int index , int target,List<List<Integer>> ans)
    {
        int i = index;
        int j = nums.length-1;
        while(i < j )
        {
            if(nums[i] + nums[j] == target)
            {
                List<Integer> lst = new ArrayList<>();
                lst.add(-target);
                lst.add(nums[i]);
                lst.add(nums[j]);
                ans.add(lst);
                i++;
                while(i < j && nums[i] == nums[i-1])
                    i++;
                j--;
                while( i < j && nums[j] == nums[j+1])
                j--;
                

            }
            else if(nums[i] + nums[j]  < target)
            i++;
            else
            j--;
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++)
        {
            int a = nums[i];
            if(i == 0 || nums[i] != nums[i-1])
            {
                twosum(nums,i+1,-a, ans);
            }
        }
        return ans;
        
    }
}