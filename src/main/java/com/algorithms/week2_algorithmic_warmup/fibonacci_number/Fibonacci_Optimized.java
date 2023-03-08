package com.algorithms.week2_algorithmic_warmup.fibonacci_number;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci_Optimized {
  private static BigInteger calc_fib(int n) {

    List<BigInteger> F = new ArrayList<BigInteger>();
    F.add(BigInteger.valueOf(0));
    F.add(BigInteger.valueOf(1));

    if (n > 1) {
      for (int i = 2; i <= n; i++) {
        BigInteger a = F.get(i - 1);
        BigInteger b = F.get(i - 2);
        F.add(i, a.add(b));
      }
    }

    return F.get(n);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
