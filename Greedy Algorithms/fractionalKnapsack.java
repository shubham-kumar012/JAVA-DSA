// Value = [60, 100, 120]
// Weight = [10, 20, 30],    W = 50
// Output : 240
public class fractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;
        int maxValKnapsack = 0;

        // Making ratio array
        int[] ratio = new int[val.length];
        for(int i=0; i<val.length; i++) {
            ratio[i] = val[i]/weight[i];
        }

        // Now Calculating The Value of Knapsack
        // Sorted in descending order thats why we iterate loop through start
        for(int i=0; i<val.length; i++) {
            if(capacity >= weight[i]) {
                capacity = capacity - weight[i];
                maxValKnapsack += val[i];
            }else {
                maxValKnapsack += ratio[i] * capacity;
                break; 
            }
        }

        System.out.println("Maximum Knapsack Value : "+maxValKnapsack);
    }
}
