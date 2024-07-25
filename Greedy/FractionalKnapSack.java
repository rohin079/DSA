package Greedy;

import java.util.*;

public class FractionalKnapSack {
    public static void main(String[] args) {

        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];

        // 0th column -> index; 1st col -> ratio of val/weight

        for (int i = 0; i < val.length; i++) {

            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // asecinding order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalans = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {

            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                finalans += val[idx];
                capacity -= weight[idx];
            }

            else {
                finalans += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }

        System.out.println("max value:" + finalans);

    }
}
