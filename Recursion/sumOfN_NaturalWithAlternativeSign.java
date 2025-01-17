// Q. 1-2+3-4+5 = 3 for n = 5

package Recursion;

public class sumOfN_NaturalWithAlternativeSign {

    static int printSum(int n) {
        // base case
        if(n == 1) {
            return 1;
        }

        // int ans = 0;
        // if(n % 2 == 0) {
        //     ans = (-n) + printSum(n-1);
        // }else {
        //     ans = n + printSum(n-1);
        // }

        return (n%2 == 0) ? (-n) + printSum(n-1) : n + printSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(printSum(10));
    }
}
