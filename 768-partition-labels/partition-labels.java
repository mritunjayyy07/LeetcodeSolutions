class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> lst = new ArrayList<>();
        int l = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < l; i++){
            map.put(s.charAt(i), i );
        }
        int j = 0;
        int x = 0;
        for(int i = 0; i < l; i ++){
            char ch = s.charAt(i);
             j = Math.max(j,map.get(ch));
            if(i == j){
                lst.add(j-x+1);
                x = i+1;
                
                j = 0;
                
            }
        }
        return lst;
    }
}