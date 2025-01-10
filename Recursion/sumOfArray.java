package Recursion;

public class sumOfArray {

    static int arraySum(int[] arr, int i) {
        if(i <= 0) {
            return 0;
        }

        // work
        return (arraySum(arr, i-1) + arr[i-1]);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(arraySum(arr, arr.length));
    }
}
