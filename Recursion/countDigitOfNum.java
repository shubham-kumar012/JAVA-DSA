package Recursion;

class countDigitOfNum {

    static int countDigit(int num) {
        if(num >= 0 && num<=9) {
            return 1;
        }

        return 1 + countDigit(num/10);
    }
    public static void main(String[] args) {
        System.out.println(countDigit(123534));
    }
}