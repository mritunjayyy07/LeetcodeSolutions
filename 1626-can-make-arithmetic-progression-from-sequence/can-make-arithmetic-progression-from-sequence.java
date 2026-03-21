class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++){
            int newdiff = arr[i] - arr[i-1];
            if(newdiff != diff)
            return false;
        }
        return true;
        
    }
}