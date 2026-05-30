class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int key = -1;
        for(int i = n-1; i > 0 ;i--){
            if(nums[i-1] < nums[i]){
                key = i-1;
                break;
            }
        }
        
        if(key != -1){
            int swap = key;
            for(int j = n-1; j >= key+1; j--){
                if(nums[j] > nums[key]){
                    swap = j;
                    break;
                }

            }
            int t = nums[key];
        nums[key] = nums[swap];
        nums[swap] = t;

        }
        
        int left = key+1;
        int right = n - 1;
        
        while (left < right) {
            
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            
            left++;
            right--;
        }

    }
}