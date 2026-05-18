class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer , Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i : nums1){
            map.put(i,1);
        }
        for(int i : nums2){
            if(map.containsKey(i)){
                set.add(i);
            }
        }
        int n = set.size();
        int [] ans = new int[n];
        int x = 0;
        for(int i : set){
            ans[x++] = i;
        }
        return ans;
    }
}