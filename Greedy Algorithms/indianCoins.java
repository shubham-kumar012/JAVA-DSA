// We are given infinite supply of denominations [1,2,5,10,20,50,500,2000]. Find min number of coins to make change for a value V.
// V = 121  ans = 3 (100+20+1)
// V = 590 ans = 4 (500+50+20+20)

import java.util.*;

public class indianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500};
        int value = 2357;
        int count = 0; // count for change

        // Sort coins in decreasing order
        Arrays.sort(coins, Comparator.reverseOrder());

        // ArrayList for string the change
        ArrayList<Integer> change = new ArrayList<>();
        
        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= value) {
                while(coins[i] <= value) {
                    value = value - coins[i];
                    change.add(coins[i]);
                    count++;
                }
            }
        }

        // Output for change 
        System.out.println("Change Needed : "+count);

        // Output for every change 
        for(int i=0; i<change.size(); i++) {
            System.out.print(change.get(i)+"+");
        }
        System.out.println();
    }
}
