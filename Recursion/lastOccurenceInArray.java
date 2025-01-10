package Recursion;

public class lastOccurenceInArray {

    // Method 1 (from last index)
    // static int lastOccurence(int arr[], int key, int i) {
    //     if(i == -1) return -1;
        
    //     if(arr[i] == key) return i;
        
    //     int idx = lastOccurence(arr, key, i-1);

    //     return idx;
    // }

    // Method 2 (from index 0)
    static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) return -1; 

        int isFound = lastOccurence(arr, key, i+1);
        
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5};
        int key = 3;
        System.out.println(lastOccurence(arr, key, 0));
    }
}
