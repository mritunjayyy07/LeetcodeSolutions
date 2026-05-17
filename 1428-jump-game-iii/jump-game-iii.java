class Solution {
    int n;
    boolean dfs ( int [] arr, int start){
        if(start < 0 || start >= n || arr[start] < 0)
        return false;
        if(arr[start] == 0)
        return true;
        arr[start] *= -1;

        boolean left = dfs(arr,(start - arr[start]));
        boolean right = dfs(arr,(start + arr[start]));
        return left || right;

    }
    public boolean canReach(int[] arr, int start) {
        n = arr.length;
        boolean ans = dfs(arr,start);
        return ans;
        
    }
}