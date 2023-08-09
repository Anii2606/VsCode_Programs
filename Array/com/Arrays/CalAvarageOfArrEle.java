// Write a Java program to calculate the average value of array elements
package com.Arrays;

import java.util.Scanner;

public class CalAvarageOfArrEle {

  public static void main(String[] args) {
    int sum = 0;
    int sum1 = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number for size 1");
    int size = sc.nextInt();
    int[] a = new int[size];

    System.out.println("Enter values");

    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    for (int i : a) {
      sum = sum + i;
    }
    System.out.printf(" %d: is number of Average ", sum / a.length);

    System.out.println();

    System.out.println("Enter any number for size 2");

    int size1 = sc.nextInt();
    int[] b = new int[size1];

    System.out.println("Enter values");

    for (int i = 0; i < a.length; i++) {
      b[i] = sc.nextInt();
    }

    for (int i = 0; i < a.length; i++) {
      sum1 = sum1 + b[i];
    }

    System.out.printf(" %d: is number of Average ", sum1 / b.length);
  }
}
