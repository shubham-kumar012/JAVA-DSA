public class maxSubarraySum_KadanesAlgo {

    static void maxSubarraySum(int number[]){
        int n = number.length;
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            currSum += number[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Max Subarray Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int[] number = {-1,-2,6,-1,3};
        maxSubarraySum(number);
    }
}
