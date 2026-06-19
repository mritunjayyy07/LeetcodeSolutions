class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int tempmax = 0;
        for(int i : gain){
            tempmax += i;
            max = Math.max(max,tempmax);
        }
        return max;
        
    }
}