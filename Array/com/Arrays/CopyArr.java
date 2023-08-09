// Write a Java program to copy an array by iterating the array.
package com.Arrays;

import java.util.Scanner;

public class CopyArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Size For Iniliaze Array");
    int num = sc.nextInt();
    int[] a = new int[num];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Input Size For Copy");
    int copy = sc.nextInt();
    int[] b = new int[copy];
    for (int i = 0; i < b.length; i++) {
      b[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i] + ", ");
    }
  }
}
