public class insertionSort {

    static void insertion_Sort(int nums[]) {
        for(int i=1; i<nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            while(prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            // insertion
            nums[prev+1] = curr;
        }
    }

    static void insertion_Sort_Reverse(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && curr > arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
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
        insertion_Sort_Reverse(nums);
        printArray(nums);
    }
}
