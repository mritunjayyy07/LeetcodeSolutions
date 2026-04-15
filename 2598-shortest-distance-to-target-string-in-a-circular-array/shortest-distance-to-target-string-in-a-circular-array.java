class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int left = startIndex;
        int right = startIndex;
        int n = words.length;
        for(int i = 0; i < words.length; i++){
            if(words[left].equals(target) || words[right].equals(target)){
                return i;
            }
            left = (left - 1 + n) % n;
            right = (right + 1) % n;
        }
        return -1;
        
    }
}