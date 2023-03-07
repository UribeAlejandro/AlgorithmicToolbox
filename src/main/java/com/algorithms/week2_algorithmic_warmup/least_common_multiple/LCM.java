package com.algorithms.week2_algorithmic_warmup.least_common_multiple;

import java.util.*;

public class LCM {
    private static long lcm_naive(int a, int b) {

        return (long) a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {

        int r = a % b;
        int current_gcd = b;

        if (a > b && r == 0) {
            return current_gcd;
        } else if (a == b) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm_naive(a, b));
    }
}
