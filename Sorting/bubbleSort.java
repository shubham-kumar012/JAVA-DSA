class bubbleSort {

    static void bubble_Sort(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<(nums.length-1)-i; j++){
                // swap
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    static void bubble_Sort_Reverse(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,6,1,9,5,2};
        bubble_Sort_Reverse(nums);
        printArray(nums);
    }
}
