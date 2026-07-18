class Solution {
    public String rearrangeString(String s, char x, char y) {
        if(s.indexOf(x) < 0 || s.indexOf(y) < 0)
        return s;
        StringBuilder sb = new StringBuilder();
        //sb.append(y);
        int a =0;
        int b = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == y){
                a++;
                continue;
            }
                
            if(s.charAt(i) == x)
            {
                b++;
                continue;
            }
            sb.append(s.charAt(i));
        }
        for(int i = 1; i <= a; i++){
            sb.append(y);
        }
        for(int i =1; i <= b; i++)
        sb.append(x);
        return sb.toString();
        
    }
}