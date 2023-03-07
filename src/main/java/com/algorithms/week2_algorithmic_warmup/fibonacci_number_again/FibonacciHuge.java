package com.algorithms.week2_algorithmic_warmup.fibonacci_number_again;

import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        long r = n % getPisanoPeriodLenght(m);

        long first = 0;
        long second = 1;

        long res = r;

        for (long i = 1; i < r; i++) {
            res = (first + second) % m;
            first = second;
            second = res;
        }

        return res % m;
    }

    private static long getPisanoPeriodLenght(long m) {
        long a = 0l;
        long b = 1l;
        long c = a + b;
        long lenght = c;

        for (long i = 0l; i < m * m; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
            if (a == 0 & b == 1) {
                lenght = i + 1l;
            }
        }

        return lenght;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

