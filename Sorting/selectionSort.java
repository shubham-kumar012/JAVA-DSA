public class selectionSort {

    static void selection_Sort(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    static void selection_Sort_reverse(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int maxPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            // swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,6,1,9,5,2};
        selection_Sort_reverse(nums);
        printArray(nums);
    }
}
