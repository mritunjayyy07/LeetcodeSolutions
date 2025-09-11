class Solution {
     private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String sortVowels(String s) {
        
         List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        
        // Step 2: Sort vowels by ASCII
        Collections.sort(vowels);
        
        // Step 3: Build result
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(vowels.get(vowelIndex++)); // replace with sorted vowel
            } else {
                result.append(c); // keep consonant same
            }
        }
        
        return result.toString();
        
    }
}