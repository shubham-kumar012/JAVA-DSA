public class shortest_path_to_Destination {

    static void getPath(String path) {
        int x = 0;
        int y = 0;

        for(char ch : path.toCharArray()) {
            if(ch=='W') x--;
            else if(ch=='E') x++;
            else if(ch=='N') y++;
            else if(ch=='S') y--;
        }

        // we using a shortes distance formula
        // UnderRoot((x2-x1)^2 + (y2-y1)^2))
        int shortestPath = (int) Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Shortest Path is : "+shortestPath);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        getPath(path);
    }
}
