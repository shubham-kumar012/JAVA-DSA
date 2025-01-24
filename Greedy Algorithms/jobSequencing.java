// Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline. it is 
// also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. 
// Maximize the total profit if only one job can be scheduled at a time.
// Job A = (4,20) , Job B = (1,10) , Job C = (1,40) , Job D = (1,30) 
// Output : C A

import java.util.*;

public class jobSequencing {

    static class Job {
        int deadline;
        int profit; 
        int id; // 0->A, 1->B, 2->C,...

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int[][] jobInfo = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // sort on the basis of profit (decreasing)
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);

        // Make arraylist to store which job are performed
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int profit = 0; // store the max profit

        for(int i=0; i<jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                profit += curr.profit;
                time++;
            }
        }
        System.out.println("Maximum Jobs : "+seq.size());
        System.out.println("Maximum Profit gain : "+profit); // maximum profit gain by job
        for(int i=0; i<seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();




    }
}
