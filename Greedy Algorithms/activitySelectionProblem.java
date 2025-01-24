import java.util.*;
class activitySelectionProblem {
    public static void main(String[] args) {
        // Variation 1 - If Activity End Time Are Already Sorted
        // T.C. -> O(n)
        // int[] start = {1,3,0,5,8,5};
        // int[] end = {2,4,6,7,9,9}; // Activity End are Sorted

        // ArrayList<Integer> ans = new ArrayList<>();
        // int activity = 1; // first activity
        // ans.add(0);
        // int endTime = end[0];

        // for(int i=1; i<start.length; i++) {
        //     int startTime = start[i];
        //     if(startTime >= endTime) {
        //         endTime = end[i];
        //         ans.add(i);
        //         activity++;
        //     }
        // }
        // System.out.println("Activities Are : "+activity);
        // for(int i=0; i<ans.size(); i++) {
        //     System.out.print("A"+ans.get(i)+" ");
        // }
        // System.out.println();


        // Variation 2 - If Activity End Time Are Not Sorted 
        int[] start = {0,1,3,5,5,8};
        int[] end = {6,2,4,7,9,9};
        ArrayList<Integer> ans = new ArrayList<>();
        // Convert in 2d Array to store index , start, end
        int[][] activity = new int[start.length][3];
        for(int i=0; i<activity.length; i++) {
            activity[i][0] = i; // Storing index
            activity[i][1] = start[i]; // Storing Start Time 
            activity[i][2] = end[i]; // Storing End Time
        }

        // Sort This 2D Array on the basis of End Time
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        // Work
        // First Activity
        int maxAct = 1;
        ans.add(activity[0][0]);
        int endTime = activity[0][2];

        // rest of All activity
        for(int i=1; i<activity.length; i++) {
            int startTime = activity[i][1];
            if(startTime >= endTime) {
                ans.add(activity[i][0]);
                endTime = activity[i][2];
                maxAct++;
            }
        }

        // printing results
        System.out.println("Activities Are : "+ maxAct);

        for(int i=0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}