class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap <>();
        int l = text.length();
        for(int i = 0; i < l; i++){
            char ch = text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int x= 0, y = 0, z = 0, a = 0, b =0;
        if(map.containsKey('b'))
         x = map.get('b');
        if(map.containsKey('a'))
         y = map.get('a');
        if(map.containsKey('n'))
         z = map.get('n');
        if(map.containsKey('l'))
         a = map.get('l');
        if(map.containsKey('o'))
         b = map.get('o');
        int min1 = 0;
        int min2 = 0;
        min1 = Math.min(x,Math.min(y,z));
        min2 = Math.min(a,b);
        return Math.min(min1,(min2/2));
        
        
    }
}