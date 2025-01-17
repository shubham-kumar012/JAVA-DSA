package Recursion;

public class sumOfDigitOfNum {

    static int calSumOfDigit(int num) {
        if(num >= 0 && num <= 9) {
            return num;
        }

        return num%10 + calSumOfDigit(num/10);
    }
    public static void main(String[] args) {
        System.out.println(calSumOfDigit(1234));
    }
}
