class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> lst = new ArrayList<>();
        Map <Integer,Integer> map = new HashMap <>();
        for(int n : nums)
        {
            if(map.containsKey(n))
            {
                lst.add(n);
            }
            map.put(n,1);
        }
        return lst;
        
    }
}