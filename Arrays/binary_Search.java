
class binary_Search{
    public static int binarySearch(int[] arr, int key){

        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            
            if(arr[mid] == key) return mid;
            else if(key < arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,10,12};
        int key = 14;
        if(binarySearch(arr, key) >= 0){
            System.out.println("Element found at index: "+binarySearch(arr, key));
        }else{
            System.out.println("Element not Found");
        }
    }
}
