// Write a Java program to remove a specific element from an array
package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEleArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size for Array");
    int s = sc.nextInt();
    int[] size = new int[s];

    System.out.println("Enter values");

    for (int i = 0; i < size.length; i++) {
      size[i] = sc.nextInt();
    }
    System.out.print("Orignal Array element is : " + "[ ");
    for (int i = 0; i < size.length; i++) {
      System.out.print(size[i] + ", ");
      //System.out.print(",");
    }

    System.out.print("]");

    System.out.println();

    System.out.println("Remove number");

    int x = sc.nextInt();
    System.out.print("Array element is (After Remove) : " + "[ ");
    for (int i = 0; i < size.length; i++) {
      if (size[i] == x) {
        continue;
      } else {
        System.out.print(size[i] + ", ");
        // System.out.print(",");
      }
    }
    System.out.print("]");
  }
}
