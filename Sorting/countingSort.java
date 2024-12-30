public class countingSort {
    
    // Counting Sort For Ascending Sorting
    static void counting_Sort(int[] arr) {
        // finding maximum range
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        // storing frequency to the count array
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    // Counting Sort For Descending Order Sorting
    static void counting_Sort_Reverse(int[] arr) {
        int maxRange = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            maxRange = Math.max(maxRange, arr[i]);
        }

        // counting the frequency
        int[] count = new int[maxRange+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for(int i=count.length-1; i>=0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    static void printArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,4,1,3,2,4,3,7,2};
        counting_Sort_Reverse(nums);
        printArray(nums);
    }
}
