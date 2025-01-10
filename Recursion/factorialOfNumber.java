package Recursion;

public class factorialOfNumber {

    static int calFactorial(int n) {
        // base case 
        if(n == 0) {
            return 1;
        }
        // Call
        int Snm1 = calFactorial(n-1);
        // kaam
        int Sn = n * Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        System.out.println(calFactorial(5));
    }
}
