class Solution {
    public String removeDuplicates(String s) {
        
        Stack <Character> stk = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(!stk.isEmpty() && stk.peek() == c)
            stk.pop();
        
        else stk.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();


            
        
    }
}