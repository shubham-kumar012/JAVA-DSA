public class ratInMazeWithBolckedPath {
    static int ways = 0;

    static void solve(int[][] maze, int row, int col, int[][] ans) {
        // Base Case - Reached Destination
        if(row == maze.length-1 && col == maze.length-1) {
            ans[row][col] = 1; // Mark the destination cell
            ways++;
            printMaze(ans);
            ans[row][col] = 0; // Backtrack
            return;
        }

        // Boundary Condition Or Obstacle Check
        if(row > maze.length-1 || col > maze.length-1 || row < 0 || col < 0) return;
        if(maze[row][col] == 0) return;
        if(maze[row][col] < 0) return; // Check if already visited
        
        // Mark in both Matrix as visited
        ans[row][col] = 1;
        maze[row][col] = -maze[row][col];

        // Explore all Directions
        solve(maze, row, col+1,ans); // Right
        solve(maze, row+1, col,ans); // Down
        solve(maze, row, col-1,ans); // Left
        solve(maze, row-1, col,ans); // Top

        // BackTrack - Undo Changes
        maze[row][col] = -maze[row][col];
        ans[row][col] = 0; 

    }

    static void printMaze(int[][] maze) {
        System.out.println("------- Path -------");
        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze.length; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 0 - Are The Obstacle
        // 1 - Are The Open/Available Path
        int[][] maze = {{1,1,0,0},
                        {1,1,0,0},
                        {0,1,1,0},
                        {1,1,1,1}};
        int[][] ans = {{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};

        solve(maze, 0,0,ans);
        System.out.println("Total ways: "+ways);
        
    }
}
