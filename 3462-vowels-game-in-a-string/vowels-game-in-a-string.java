class Solution {
    public boolean doesAliceWin(String s) {
        int freq = 0;
        String vow = "aeiou";
        for(char ch : s.toCharArray())
        {
            if(vow.indexOf(ch) >= 0)
            freq ++;
            
        }
        if (freq == 0 )
        return false;
        if(freq == 1)
        return true;
        if(freq%2 == 0)
        return true;
        else
        return true;
        
    }
}