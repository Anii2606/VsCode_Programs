// Write a Java program to sum values of an array.
package com.Arrays;

import java.util.Scanner;

public class SumArrElement {

  public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any array value for create");
    int number = sc.nextInt();
    int num[] = new int[number];
    // num[0] = 12;
    // num[1] = 11;
    // num[2] = 10;
    //input
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }
    //output
    for (int i = 0; i < num.length; i++) {
      System.out.println("NUMBER IS :" + num[i]);
    }
    for (int j : num) {
      sum = sum + j;
    }
    System.out.println("Sum is :" + sum);
  }
}
