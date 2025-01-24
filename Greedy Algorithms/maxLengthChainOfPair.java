// Q. You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
// A pair (c,d) can come after pair (a,b) if b<c. Find the longest chain which can be formed from a given set of pairs.
// Pairs = [[5,24],[39,60],[5,28],[27,40],[50,90]]
// output : 3

import java.util.*;

public class maxLengthChainOfPair {
    public static void main(String[] args) {
        int[][] pair = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int n = pair.length;
        int maxChainLength = 0;

        // sort array on the basis of second value
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        // first chain
        maxChainLength += 1;
        int endPoint = pair[0][1];
        for(int i=1; i<n; i++) {
            int startPoint = pair[i][0];
            if(startPoint >= endPoint) {
                maxChainLength++;
                endPoint = pair[i][1];
            }
        } 

        System.out.println("Max Length of Chain : "+maxChainLength);
    }
}
