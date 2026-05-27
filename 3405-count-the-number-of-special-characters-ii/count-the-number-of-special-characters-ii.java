class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int x = ch;
            if(x >= 97 && x <= 122){
                map.put(ch,i);
            }
            else{
                if(map.containsKey(ch)) continue;
                map.put(ch,i);
            }
        }
        char c = 'a';
        for(int i =1; i <= 26 ;i++){
            int x = c;
            if(map.containsKey(c) && (x >= 97 && x <= 122)){
                int l = map.get(c);
                if(map.containsKey(Character.toUpperCase(c))){
                int f = map.get(Character.toUpperCase(c));
                if(l < f)
                count++;
                }
            }
            c++;
        }
        return count;
    }
}