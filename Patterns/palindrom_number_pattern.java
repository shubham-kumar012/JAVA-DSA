//      1 
//    2 1 2 
//   3 2 1 2 3 
// 4 3 2 1 2 3 4 

public class palindrom_number_pattern {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++){
            // printing space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            // printing number                  
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }

            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
