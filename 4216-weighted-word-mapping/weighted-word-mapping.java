class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<Character,Integer> map = new HashMap<>();
        int as = 122;
        char chh = 'a';
        for(int i : weights)
            {
                map.put(chh,i);
                chh++;
                
            }
        String ans = "";
        for(String s : words)
            {
                int sum = 0;
                for(char ch : s.toCharArray())
                    {
                        sum += map.get(ch);
                        
                    }
                sum = sum % 26;
                int x = as - sum;
                char cha = (char)x;
                ans = ans + cha;
                
            }
        return ans;
        
    }
}