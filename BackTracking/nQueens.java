public class nQueens {
    // This method print the board
    static void printBoard(char[][] board) {
        System.out.println("------- board -------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    // This method check for a particullar queen if it can place or not on that position
    static boolean canPlaced(char[][] board, int row, int col) {
        // top
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // dia top right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q') return false;
        }

        // dia top left
        for(int i=row-1, j=col-1; i>= 0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    // This method find the ways of placing the queen in safe positions
    static void nQueen(char[][] board, int row) {
        // base case
        if(row == board.length) {
            printBoard(board);
            return;
        }

        //recursion
        for(int j=0; j<board.length; j++) { // loop for column
            if(canPlaced(board,row,j)) {
                board[row][j] = 'Q'; 
                nQueen(board, row+1); // recursion
                board[row][j] = 'x'; // backtrack
            }
        }
    }

    static int count = 0;
    static void nQueenWaysCount(char[][] board, int row) {
        // base case
        if(row == board.length) {
            count++;
            return;
        }

        //recursion
        for(int j=0; j<board.length; j++) { // loop for column
            if(canPlaced(board,row,j)) {
                board[row][j] = 'Q'; 
                nQueenWaysCount(board, row+1); // recursion
                board[row][j] = 'x'; // backtrack
            }
        }
    }

    static boolean printIfExistNQueen(char[][] board, int row) {
        // base case
        if(row == board.length) {
            return true;
        }

        //recursion
        for(int j=0; j<board.length; j++) { // loop for column
            if(canPlaced(board,row,j)) {
                board[row][j] = 'Q'; 
                if(printIfExistNQueen(board, row+1)) { // recursion
                    return true;
                } 
                board[row][j] = 'x'; // backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        char[][] board = new char[row][col];
        // Filling board with empty(x)
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                board[i][j] = 'x';
            }
        }

        // nQueen(board, 0);
        // nQueenWaysCount(board, 0);
        // System.out.println("Total ways: "+count);
        boolean a = printIfExistNQueen(board, 0);
        if(printIfExistNQueen(board, 0)) {
            System.out.println("Solution is Possible.");
            printBoard(board);
        }else{
            System.out.println("Solution is Not Possible.");
        }
    }
}
