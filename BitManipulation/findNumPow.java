// Fast Exponential of calculation of power of two
// Time Complexity - O(logn)
public class findNumPow {

    static int fastExpo(int n, int pow) {
        int ans = 1;

        while(pow > 0) {
            if((pow & 1) != 0) { // check LSB
                ans = ans * n;
            }
            n = n*n;
            pow = pow>>1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3,5));
    }
}
