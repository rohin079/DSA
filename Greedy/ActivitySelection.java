package Greedy;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        
        int start[] = {1, 3, 0 ,5 ,8 ,5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //end time basic activities sorted

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //For first activity:
        count = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i =1; i<start.length; i++){
            if(start[i] <= lastEnd ){
                count++;
                ans.add(i);
                lastEnd = end[i];
            }

        }

        System.out.println("Maximum activitis = " + count);
    }
}
