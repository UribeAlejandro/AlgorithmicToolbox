package com.algorithms.week3_greedy_algorithms.money_change;

import java.util.Scanner;

public class Change {
  public static int getChange(int money) {
    int num_coins = 0;
    int[] coins = {10, 5, 1};

    for (int coin : coins) {
      while (money - coin >= 0) {
        num_coins += 1;
        money -= coin;
      }
    }
    return num_coins;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.println(getChange(m));
  }
}
