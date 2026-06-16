class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(sb.length() >= 1)
                sb.deleteCharAt(sb.length() - 1);
                else
                continue;

            }
            else if(ch == '#'){
                StringBuilder rev = new StringBuilder(sb);
                sb.append(rev);
            }
            else if(ch == '%'){
                sb.reverse();
            }
            else{
                sb.append(ch);
            }

        }
        return sb.toString();
        
    }
}