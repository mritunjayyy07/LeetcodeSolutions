class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Set<Integer> setR = new HashSet<>();
        Set<Integer> setC = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(matrix[i][j] == 0)
                {
                    setR.add(i);
                    setC.add(j);
                }


            }
        }
            for(int row : setR)
            {
                for(int j = 0; j < m ;j++)
                matrix[row][j] = 0;
            }
            for(int col : setC)
            {
                for(int i = 0; i < n; i++)
                matrix[i][col] = 0;
             
             }

        }
        
    }
