package week3_greedy_algorithms.maximum_value_of_the_loot;

import java.util.*;

public class FractionalKnapsack {
    private static int getBestItem(int n, int[] values, int[] weights) {
        int bestItem = 0;
        double maxValuePerWeight = 0d;

        for (int i = 0; i < n; i++) {
            if (weights[i] > 0) {
                if ((double) values[i] / weights[i] > maxValuePerWeight) {
                    maxValuePerWeight = (double) values[i] / weights[i];
                    bestItem = i;
                }
            }
        }
        return bestItem;
    }

    private static double getOptimalValue(int n, int capacity, int[] values, int[] weights) {
        int numberItems;
        int indexBestItem;
        double totalValue = 0;

        for (int i = 0; i < n; i++) {
            if (capacity == 0) {
                return totalValue;
            } else {
                indexBestItem = getBestItem(n, values, weights);
                numberItems = Math.min(weights[indexBestItem], capacity);
                totalValue = totalValue + (double) numberItems * (double) values[indexBestItem] / weights[indexBestItem];
                weights[indexBestItem] = weights[indexBestItem] - numberItems;
                capacity = capacity - numberItems;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(n, capacity, values, weights));
    }
} 
