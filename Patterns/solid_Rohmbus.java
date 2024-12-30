// ****
// ****
// ****
// ****


public class solid_Rohmbus {
    public static void main(String[] args) {
        int n = 4;

        
        for(int i = 1; i<=n; i++){
            // printing space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // printing pattern
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
