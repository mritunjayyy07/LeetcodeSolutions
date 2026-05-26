class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        char ch = 'a';
        char CH = 'A';
        for(int i = 1; i <= 26; i++){
            if(word.indexOf(ch) >=0 && word.indexOf(CH)>=0)
            count++;
            ch++;
            CH++;
        }
        return count;
        
    }
}