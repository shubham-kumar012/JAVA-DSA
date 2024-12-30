// T.C => O(n^3)
public class maxSubarraySum_bruteForce {

    public static void maxSubArray(int[] number){
        int n = number.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += number[k];
                }
                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("Maximum Subarray Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {-1,-2,6,-1,3};
        maxSubArray(number);
    }
}
