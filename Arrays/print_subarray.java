public class print_subarray {

    public static void printSubarray(int number[]){

        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        printSubarray(arr);

    }
}
