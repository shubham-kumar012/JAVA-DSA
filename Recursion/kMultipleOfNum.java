package Recursion;

public class kMultipleOfNum {

    static void printMultiple(int n, int k) {
        if(k == 1) {
            System.out.println(n+" ");
            return;
        }

        printMultiple(n, k-1);
        System.out.println(k * n +" ");
    }
    public static void main(String[] args) {
        printMultiple(5, 5);        
    }
}
