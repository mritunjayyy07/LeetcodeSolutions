class Solution {
    public int removeDuplicates(int[] nums) {
        int i =1 ;
        int x =nums[0];
        int a =0;
        int c  =0 ;
        while(i < nums.length){

            if(nums[i] == x ){
                i++;
                c = 1;
                
            }
            else{
                nums[a++] = x;
                if(c == 1)
                {
                    nums[a++] = x;
                    c = 0;
                }
                x = nums[i];
                i++;
            }

            //nums[a-1] = nums[i]; 
        }
        nums[a++] = nums[i-1];
        if(c == 1) nums[a++] = nums[i-1];
        return a;
        
    }
}