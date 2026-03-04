class Solution {
    public int[] countBits(int n) {
        int [] result = new int [n+1];
        for(int i =0 ; i < n+1; i++)
        result[i] = Integer.bitCount(i);
        return result;
        
    }
}