class Solution {
    public void setZeroes(int[][] matrix) {
         int n = matrix.length;
        int m = matrix[0].length;

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

       
        for (int row : zeroRows) {
            for (int j = 0; j < m; j++) {
                matrix[row][j] = 0;
            }
        }

       
        for (int col : zeroCols) {
            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }
        }
        
    }
}