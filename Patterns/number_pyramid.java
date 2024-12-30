//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 

public class number_pyramid {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++){
            // printing space
            for(int j=1; j<=(n-i)+1; j++){
                System.out.print(" ");
            }

            // printing number
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
