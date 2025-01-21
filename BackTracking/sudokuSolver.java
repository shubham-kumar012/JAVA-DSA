public class sudokuSolver {

    static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // row
        for(int i=0; i<sudoku.length; i++) {
            if(sudoku[row][i] == digit) {
                return false;
            }
        }

        // col
        for(int i=0; i<sudoku.length; i++) {
            if(sudoku[i][col] == digit) {
                return false;
            }
        }

        // grid
        int stRow = row/3 * 3;
        int stCol = col/3 * 3;
        for(int i=stRow; i<stRow+3; i++) {
            for(int j=stCol; j<stCol+3; j++) {
                if(sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solve(int[][] sudoku, int row, int col) {
        // base case
        if(row == 9 && col == 0) {
            return true;
        }
        

        int nextRow = row, nextCol = col+1;
        if(col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // if that cell already had a number
        if(sudoku[row][col] != 0) {
            return solve(sudoku, nextRow, nextCol);
        }
        // recursion
        for(int i=1; i<=9; i++) {
            if(isSafe(sudoku, row, col, i)) {
                sudoku[row][col] = i;
                if(solve(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solve(sudoku,0,0)) {
            System.out.println("Solution Exist.");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Doesn't Exist.");
        }
    }

    
    static void printSudoku(int[][] sudoku) {
        for(int i=0; i<sudoku.length; i++) {
            for(int j=0; j<sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}
