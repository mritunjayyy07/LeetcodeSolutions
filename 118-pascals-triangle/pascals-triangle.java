class Solution {
    public List<List<Integer>> generate(int numRows) {
        
           List<List<Integer>> triangle = new ArrayList<>();
        
        
        for (int row = 0; row < numRows; row++) {
            
            List<Integer> currentRow = new ArrayList<>();
            
            
            for (int col = 0; col <= row; col++) {
               
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    
                    currentRow.add(triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col));
                }
            }
            
            
            triangle.add(currentRow);
        }
        
        return triangle;
        
    }
}