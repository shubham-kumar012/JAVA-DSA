class backtrackOnArray {

    static void performAction(int[] arr, int i, int val) {
        // base case
        if(i == arr.length) {
            printArray(arr);
            return;
        }

        // recursion
        arr[i] = val;
        performAction(arr, i+1, val+1);

        // backtrack
        arr[i] = arr[i] - 2;
    }

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        performAction(arr, 0, 1);
        printArray(arr);
    }
}