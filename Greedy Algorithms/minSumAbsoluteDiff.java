// Q. Given two arrays A and B of Same length n. Pair each element of Array A to an element in array B, Such that 
// sum of Absolute differences of all the pairs is minimum
import java.util.*;
public class minSumAbsoluteDiff {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {2,1,3}; // output : 0

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsDiff = 0;
        for(int i=0; i<A.length; i++) {
            minAbsDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum Absolute Difference : "+minAbsDiff);
    }
}
