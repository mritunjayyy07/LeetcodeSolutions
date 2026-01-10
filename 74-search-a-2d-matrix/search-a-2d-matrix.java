class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int i = 0;
        int j = 0;
        int end = (m*n) - 1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(mid >= n)
            {
                i = mid/n;
                 j = mid % n;
            }
            else
            {
                i = 0;
                j = mid;
            }
            
            if(matrix[i][j] == target)
            return true;
            else if(matrix[i][j] > target)
            {
                end = mid -1;
            }
            else if(matrix[i][j] < target)
            {
                start = mid+1;
            }
            
        }
        return false;
        
    }
}