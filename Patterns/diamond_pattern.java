//            *
//           ***
//          *****
//         *******
//         *******
//          *****
//           ***
//            *

public class diamond_pattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper Half
        for(int i=1; i<=n; i++){
            // printing space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //printing star
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for(int i=n; i>=1; i--){
            // printing space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //printing star
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
