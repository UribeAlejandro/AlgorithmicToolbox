package week3_greedy_algorithms.maximum_advertisement_revenue;

import java.util.*;

public class DotProduct {
    private static long maxDotProduct(int[] a, int[] b) {
        long result = 0;
        long[] prices = new long[b.length];

        for (int i = 0; i < a.length; i++) {
            long bestPricePerClick = 0;
            for (long price : b) {
                if (price > bestPricePerClick) {
                    prices[i] = price;
                }
                System.out.println(Arrays.toString(prices));
            }
        }
        System.out.println(Arrays.toString(prices));

        for (int i = 0; i < a.length; i++) {
            result += (long) a[i] * prices[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

