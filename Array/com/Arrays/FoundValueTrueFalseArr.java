// Write a Java program to test if an array contains a specific value.
package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FoundValueTrueFalseArr {

  public static void main(String[] args) {
    boolean b = false;
    System.out.println("Enter number for size of Array");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a = new int[num];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Array value is :");
    System.out.println(Arrays.toString(a));
    System.out.println("Enter specific value");
    int x = sc.nextInt();
    for (int i = 0; i < a.length; i++) {
      if (x == a[i]) {
        b = true;
      }
      // System.out.println(
      //   "specific value is in Array :" + "a[" + i + "]" + "index"
      // );
      // } else {
      //   b = false;
      // }
    }
    System.out.println(b);
  }
}
