// T.C. = O(n^2)
public class maxSubarraySum_prefixArray {

    static void maxSubarraySum(int[] number){
        int n = number.length;
        int prefix[] = new int[n];

        // Filling the Prefix Sum Array
        prefix[0] = number[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;      //  (start) | (end) are the range of subarray where we found the sum for each subarray

                // calculating sum using prefix array
                currSum =  start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("Maximum Subarray Sum : "+maxSum);

    }
    public static void main(String[] args) {
        int number[] = {-1,-2,6,-1,3};
        maxSubarraySum(number);
    }
}
