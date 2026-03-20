class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> stk = new Stack<>();
        int n = temperatures.length;
        int [] ans = new int [n];
        for(int i =0 ; i < n; i++ ){
           
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()])
            {
                ans[stk.peek()] = i - stk.peek();
                stk.pop();

            }
             stk.push(i);
            
               
            
        }
        return ans;
        
    }
}