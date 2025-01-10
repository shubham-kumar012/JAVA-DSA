package Recursion;

public class sumOfNaturalNum {

    static int sumNatural(int num) {
        if(num <= 1) {
            return num;
        }
        int n = sumNatural(num-1);
        return((num + n));
    }
    public static void main(String[] args) {
        sumNatural(20);
    }
}
