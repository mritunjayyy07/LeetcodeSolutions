class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        Map<Integer,Integer> map = new HashMap <>();
        for(int i : nums1) map.put(i,1);
        for(int i : nums2){
            if(map.containsKey(i))
            return i;
        }
        return -1;

        
    }
}