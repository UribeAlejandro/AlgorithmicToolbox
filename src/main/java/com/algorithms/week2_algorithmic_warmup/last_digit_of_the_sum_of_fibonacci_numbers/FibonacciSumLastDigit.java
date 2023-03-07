package com.algorithms.week2_algorithmic_warmup.last_digit_of_the_sum_of_fibonacci_numbers;

import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        long sum;

        if (n <= 1) {
            return n;
        } else {
            n = (n + 2) % 60;
            sum = getFibonacciSumLastDigit((int) n + 1);
            return sum;
        }
    }

    private static long getFibonacciSumLastDigit(int n) {
        List<Integer> F = new ArrayList<Integer>();
        F.add(0);
        F.add(1);

        for (int i = 2; i <= n; i++) {
            Integer a = F.get(i - 1) % 10;
            Integer b = F.get(i - 2) % 10;
            F.add(i, (a + b) % 10);
        }
        return F.stream().mapToLong(a -> a).sum() % 9;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

