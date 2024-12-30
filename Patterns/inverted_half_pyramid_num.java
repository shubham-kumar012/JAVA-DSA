// 12345
// 1234
// 123
// 12
// 1

public class inverted_half_pyramid_num {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++){
            // printing for star
            for(int k=1; k<=(n-i)+1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
