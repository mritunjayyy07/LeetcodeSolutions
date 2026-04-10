class Solution {
    public boolean isNumber(String s) {
        s = s.trim();  
        if (s.length() == 0) return false;

        boolean digit = false;
        boolean dot = false;
        boolean E = false;
        boolean afE = true; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                digit = true;
                if (E) afE = true;
            } 
            else if (ch == '+' || ch == '-') {
                
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } 
            else if (ch == '.') {
                
                if (dot || E) return false;
                dot = true;
            } 
            else if (ch == 'e' || ch == 'E') {
               
                if (E || !digit) return false;
                E = true;
                afE = false; 
            } 
            else {
                return false; 
            }
        }

        return digit && afE;
    }
}