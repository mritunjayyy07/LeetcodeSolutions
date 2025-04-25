class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<Map<Character,Integer>, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            Map<Character,Integer> maps = new HashMap<>();
            for(char ch : s.toCharArray())
            {
                if(maps.containsKey(ch))
                {
                    maps.put(ch,maps.get(ch)+1);
                }
                else
                maps.put(ch,1);

            }

            // String pat = "";
            // System.out.println(maps);
            // for(char a = 'a'; a <= 'z'; a++)
            // {
            //     if(maps.containsKey(a))
            //     pat = pat + "" +maps.get(a);
            //     else
            //     pat = pat + "" + "x";
            // }
            // System.out.println(pat);
            

            if(!map.containsKey(maps))
            map.put(maps,new ArrayList<>());
            map.get(maps).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}