class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];
        
        int prod = 1;
        for(int i = nums.length-1; i >= 0; i--)
        {
             prod *= nums[i];
             ans[i] = prod;
        }
        prod = 1;
        if(ans.length == 1)
        {
            ans[0] = nums[0];
        }
        ans[0] = ans[1];
        
        for(int i = 0; i < nums.length ; i++)
        System.out.println(ans[i]);

        for(int i = 1; i < nums.length-1 ; i++)
        { 
            prod = prod*nums[i-1];
            
            ans[i] = prod * ans[i+1];

        }

        
                ans[nums.length-1] = prod * nums[nums.length -2] ;
        return ans;
        
    }
}