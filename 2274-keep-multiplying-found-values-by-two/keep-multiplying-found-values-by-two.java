class Solution {
    public static int findFinalValue(int[] nums, int original) {
        
    	int n =  nums.length;
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for (int i = 0; i < n; i++) {
			hs.add(nums[i]);
		}
    	
    	while(hs.contains(original)) {
    		
    		original *= 2;
    		
    	}
    	
    	return original;
    }
}