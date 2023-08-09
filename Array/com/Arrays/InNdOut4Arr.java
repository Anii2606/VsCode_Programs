package com.Arrays;

import java.util.Scanner;

public class InNdOut4Arr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array index numbers");
    int in = sc.nextInt();
    int[] num = new int[in];
    //input
    for (int i = 0; i < in; i++) {
      System.out.print("Index of " + i + " :");
      num[i] = sc.nextInt();
    }
    System.out.print("created array is :");
    //output
    for (int i = 0; i < in; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
