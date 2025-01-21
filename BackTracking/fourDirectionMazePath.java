public class fourDirectionMazePath {

    static void path(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        // base case
        if(sr > er || sr < 0) return;
        if(sc > ec || sc < 0) return;
        if(isVisited[sr][sc]) return;
        if(sr >= er && sc >= ec) {
            System.out.println(s);
            return;
        }
        
        isVisited[sr][sc] = true;
        // right
        path(sr, sc+1, er, ec, s+"R", isVisited);
        // down
        path(sr+1, sc, er, ec, s+"D", isVisited);
        // upword
        path(sr-1, sc, er, ec, s+"U", isVisited);
        // left
        path(sr, sc-1, er, ec, s+"L", isVisited);
        // backtracking
        isVisited[sr][sc] = false;
    }

    static int pathWaysCount(int sr, int sc, int er, int ec,boolean[][] isVisited) {
        // base case
        if(sr > er || sr < 0) return 0;
        if(sc > ec || sc < 0) return 0;
        if(isVisited[sr][sc]) return 0;
        if(sr >= er && sc >= ec) {
            return 1;
        }

        isVisited[sr][sc] = true;
        // right
        int right = pathWaysCount(sr, sc+1, er, ec, isVisited);
        // down
        int down = pathWaysCount(sr+1, sc, er, ec, isVisited);
        // upword
        int up = pathWaysCount(sr-1, sc, er, ec, isVisited);
        // left
        int left = pathWaysCount(sr, sc-1, er, ec, isVisited);
        // backtracking
        isVisited[sr][sc] = false;

        return right+down+up+left;
    }
    public static void main(String[] args) {
        int row = 2; 
        int col = 2;
        boolean[][] isVisited = new boolean[row][col];
        path(0,0,row-1,col-1,"",isVisited);
        System.out.println("Total Ways: "+pathWaysCount(0, 0, row-1, col-1, isVisited));
    }
}
