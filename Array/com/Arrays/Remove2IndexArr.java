// Write a Java program to remove a specific element from an array
package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Remove2IndexArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size for Array");
    int s = sc.nextInt();
    int[] size = new int[s];
    System.out.println("Enter values");
    for (int i = 0; i < size.length; i++) {
      size[i] = sc.nextInt();
    }
    System.out.println();
    System.out.println("orignal Arrays " + Arrays.toString(size));
    int x1 = 1;
    // remove second index in Array
    for (int i = x1; i < size.length - 1; i++) {
      size[i] = size[i + 1];
    }
    System.out.println("Before removing ,Arrays is :" + Arrays.toString(size));
    // System.out.println("Remove number");
    // int x = sc.nextInt();

    // for (int i = 0; i < size.length; i++) {
    //   if (size[i] == x) {
    //     continue;
    //   } else {
    //     System.out.print(
    //       "After Remove element Array is :" + Arrays.toString(size)
    //     );
    //   }
    // }
  }
}
