class Solution {
    public String reverseVowels(String s) {
        int l =0;
        int r = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        String vowel = "AEIOUaeiou";
        while( l <= r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if(vowel.indexOf(ch1) < 0){
                l++;
            }
            else if(vowel.indexOf(ch2) < 0){
                r--;
            }
            else{
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;

            }
        }
        return sb.toString();
        
    }
}