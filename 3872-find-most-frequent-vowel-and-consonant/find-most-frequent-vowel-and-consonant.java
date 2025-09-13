class Solution {
    public int maxFreqSum(String s) {
        int freqvow = 0;
        int freqcons = 0;
        Map<Character,Integer> map = new HashMap<>();
        String x = "aeiou";

        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch , map.get(ch)+1);


            }
            else
            {
                map.put(ch,1);
            }
        }
        for(char ch : s.toCharArray())
        {
            if(x.indexOf(ch) >=0)
            {
                if(map.get(ch) > freqvow)
                freqvow = map.get(ch);
            }
            else
            {
                if(map.get(ch) > freqcons)
                freqcons = map.get(ch);
            }

        }
        return freqvow+freqcons;
        
    }
}