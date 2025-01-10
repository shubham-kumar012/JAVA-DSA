package Recursion;

public class printNumber1ToN {

    static void printIncr(int n) {
        if(n == 1) {
            System.out.print(1+" ");
            return;
        }
        printIncr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printIncr(10);
    }
}
