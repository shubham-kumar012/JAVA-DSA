package Recursion;

public class firstOccurenceInArray {

    static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) return -1;

        if(key == arr[i]) return i;

        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 5;
        System.out.println(firstOccurence(arr, key, 0));
    }
}
