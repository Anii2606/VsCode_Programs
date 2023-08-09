//  Write a Java program to find the index of an array element.
package com.Arrays;

import java.util.Scanner;

// linear Search

public class FoundIntValueArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size index");
    int in = sc.nextInt();
    int[] num = new int[in];
    //input
    for (int i = 0; i < in; i++) {
      System.out.print("enter value of " + i + " :");
      num[i] = sc.nextInt();
    }
    System.out.println("Enter X value");
    int x = sc.nextInt();
    // System.out.println();
    //output
    for (int i = 0; i < num.length; i++) {
      if (num[i] == x) {
        System.out.println("X found on index :" + i);
      }
    }
    // That is called in computer science that is linear search and this is a algorithum
  }
}
