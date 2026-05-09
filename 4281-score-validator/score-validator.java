class Solution {
    public int[] scoreValidator(String[] events) {
        int [] ans = new int [2];
        for(String i : events){
            if(ans[1] == 10) break;
            if(i.equals("W")) ans[1]++;
            else if(i.equals("WD")) ans[0]++;
            else if(i.equals("NB")) ans[0]++;
            else{
                int n = Integer.parseInt(i);
                ans[0] += n;

            }
        }
        return ans;
        
    }
}