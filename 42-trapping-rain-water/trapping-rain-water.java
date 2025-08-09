class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int high = height.length-1;
        int low = 0;
        int lmax = 0;
        int rmax =0;
        while(low < high)
        {
            if(height[low] < height[high])
            {
                lmax = Math.max(lmax,height[low]);
                ans+= lmax - height[low];
                low++;
            }
            else
            {
                rmax = Math.max(rmax,height[high]);
                ans+= rmax - height[high];
                high--;
            }
        }
        return ans;
        
    }
}