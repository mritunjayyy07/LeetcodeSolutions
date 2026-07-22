class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i : target){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i : arr){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        return map1.equals(map2);

        
    }
}