class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') continue;

                // row & column
                for (int k = 0; k < 9; k++) {
                    if (k != j && board[i][k] == board[i][j]) return false;
                    if (k != i && board[k][j] == board[i][j]) return false;
                }

                // 3x3 box
                int rs = (i / 3) * 3;
                int cs = (j / 3) * 3;

                for (int r = rs; r < rs + 3; r++) {
                    for (int c = cs; c < cs + 3; c++) {
                        if ((r != i || c != j) && board[r][c] == board[i][j])
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
