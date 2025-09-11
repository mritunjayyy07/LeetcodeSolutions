class Solution {
    public String sortVowels(String s) {
        char [] vow = new char[s.length()];
        String t = "";
        int x = 0;
        for(int i =0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'||ch == 'U'|| ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u')
            {
                t = t + '_';
                vow[x++] = ch;
            }
            else 
            t = t+ch;
            
            
        }
        String res = "";
        Arrays.sort(vow);
        String vows = new String(vow);
        x = vows.lastIndexOf('\u0000') + 1;
        
        for(char ch : t.toCharArray())
        {
            if(ch == '_')
            res = res+vows.charAt(x++);
            else
            res=res+ch;
        }
        return res;
        
    }
}