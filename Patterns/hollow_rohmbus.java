// ****
// *  *
// *  *
// ****


public class hollow_rohmbus {
    public static void main(String[] args) {
        int n = 4; 

        for(int i=1; i<=n; i++){
            // printing space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // printing star
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
