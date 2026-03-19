class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> stk = new Stack <>();
        Stack <Character> stk2 = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '#')
            {
                if(stk.isEmpty())
                continue;

                stk.pop();
            }
            else stk.push(c);
        }
        StringBuilder news = new StringBuilder();
        for(char ch : stk)
        news.append(ch);
        
        for(char c : t.toCharArray())
        {
            if(c == '#')
            {
                if(stk2.isEmpty())
                continue;

                stk2.pop();
            }
            else stk2.push(c);
        }
        StringBuilder newt = new StringBuilder();
        for(char ch : stk2)
        newt.append(ch);
        return news.toString().equals(newt.toString());
    }
}