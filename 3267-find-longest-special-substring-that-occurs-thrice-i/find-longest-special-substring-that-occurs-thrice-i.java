class Solution {
    public int maximumLength(String s) {
        HashMap<String, Integer> substringCount = new HashMap<>();
        int maxL = -1;

        
        for (int length = 1; length <= s.length(); length++) {
            for (int i = 0; i <= s.length() - length; i++) {
                String sub = s.substring(i, i + length);
                
                if (isSpecial(sub)) {
                    substringCount.put(sub, substringCount.getOrDefault(sub, 0) + 1);
                 
                    if (substringCount.get(sub) >= 3) {
                        maxL = Math.max(maxL, length);
                    }
                }
            }
        }

        return maxL;
    }

    
    private boolean isSpecial(String s) {
        char fChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != fChar) {
                return false;
            }
        }
        return true;
    }
        
    }
