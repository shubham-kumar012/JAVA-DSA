package Recursion;

public class meanOfArray {

    static void calMean(int[] arr, float mean, int i) {
        // base case
        if(i == arr.length) {
            System.out.println("Mean is: "+mean/arr.length);
            return;
        }

        // kaam 
        calMean(arr, mean+arr[i], i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // 
        calMean(arr, 0,0);
    }
}
