class Solution {
    public String removeOccurrences(String s, String part) {
        String sub = "";
        
        int p = s.indexOf(part);
        int len = part.length();
        while(p != -1)
        { 
            int l = s.length();
            sub="";
            for(int i = 0; i < l; i++ )
            {
                if(i >= p &&  i <=(p+len-1))
                continue;
                else
                sub = sub  + s.charAt(i);

            }
            System.out.println(sub);
            s = sub;
            p = s.indexOf(part);
        }
        return s;
        
    }
}