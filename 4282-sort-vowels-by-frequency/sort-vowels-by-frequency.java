class Solution {
    public String sortVowels(String s) {
       


        Set<Character> vowels = Set.of('a','e','i','o','u');
        
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> firstIndex = new HashMap<>();
        
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.contains(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                firstIndex.putIfAbsent(ch, i);
            }
        }
        
        
        List<Character> vowelList = new ArrayList<>(freq.keySet());
        
        vowelList.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a); 
            }
            return firstIndex.get(a) - firstIndex.get(b); 
        });
        
        
        StringBuilder sortedVowels = new StringBuilder();
        for (char ch : vowelList) {
            int count = freq.get(ch);
            while (count-- > 0) {
                sortedVowels.append(ch);
            }
        }
        
        
        StringBuilder result = new StringBuilder(s);
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                result.setCharAt(i, sortedVowels.charAt(idx++));
            }
        }
        
        return result.toString();
    }

}