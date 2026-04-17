class Solution {
    private int reverse(int x){
        int s = 0;
        while(x != 0){
            s = s * 10 + (x%10);
            x = x /10;
        }
        return s;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map < Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            
            int r = reverse(nums[i]);
            if(map.containsKey(nums[i])){
                ans = Math.min(ans,Math.abs(i  - map.get(nums[i])));
                map.put(r,i);
            }
            map.put(r,i);
        }
        if(ans == Integer.MAX_VALUE)
        return -1;
        return ans;
        
        
    }
}