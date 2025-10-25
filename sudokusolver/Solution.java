package sudokusolver;

public class Solution {

    // Check if placing 'val' is valid
    public boolean isSafe(char[][] board, int row, int col, int val) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char)(val + '0')) {
                return false;
            }
            if (board[i][col] == (char)(val + '0')) {
                return false;
            }
            // Check 3x3 subgrid
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == (char)(val + '0')) {
                return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        // Base condition: if row reaches beyond the last one
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        // Move to next column or next row
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // Skip pre-filled cells
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i + '0');

                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        // Backtrack
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }

    // Main function to solve the Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
