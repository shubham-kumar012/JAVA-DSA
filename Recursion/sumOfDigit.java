package Recursion;

public class sumOfDigit {

    static int sumOfNumDigit(int n) {
        if(n <= 0) {
            return 0;
        }

        return sumOfNumDigit(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumDigit(151));
    }
}
