// maze path problem with 2 directions[right, down]
public class mazePath {

    static void path(int sr, int sc, int er, int ec, String s) {
        // base case
        if(sc > ec) return;
        if(sr > er) return;
        if(sr>=er && sc>=ec) {
            System.out.println(s);
            return;
        }

        // right 
        path(sr,sc+1,er,ec,s+"R");

        // down
        path(sr+1,sc,er,ec,s+"D");
    }

    static int pathWaysCount(int sr, int sc, int er, int ec) {
        // base case
        if(sc > ec) return 0;
        if(sr > er) return 0;
        if(sr>=er && sc>=ec) {
            return 1;
        }

        // right 
        int a = pathWaysCount(sr,sc+1,er,ec);

        // down
        int b = pathWaysCount(sr+1,sc,er,ec);

        return a+b;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        path(1,1,row, col,"");
        System.out.println(pathWaysCount(1,1,row, col));
    }
}
