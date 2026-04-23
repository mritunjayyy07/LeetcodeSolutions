class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        
        List <Integer> lst = new ArrayList<>();
        Set <Integer> set = new HashSet <>();
        for(int n : nums)
        {
           int setsize = set.size();
            set.add(n);
            if(setsize == set.size())
            lst.add(n);
        }
        return lst;
        
    

    }
}