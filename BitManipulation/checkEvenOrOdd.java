public class checkEvenOrOdd {

    static void evenOrOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(11);
        evenOrOdd(3);
        evenOrOdd(4);

    }
}
