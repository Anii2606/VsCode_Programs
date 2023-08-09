// Write a Java program to print the following grid.

/*
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0 0

 */
// 10 rows, 10 colums
package com.Arrays;

public class PrintGrid2dArr {

  public static void main(String[] args) {
    //loop for rows
    // for (int i = 1; i <= 10; i++) {
    //   // loop for colums
    //   for (int j = 1; j < 10; j++) {
    //     System.out.print("-" + " ");
    //   }
    //   System.out.println();
    // }
    int[][] grid = new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.printf("%2d", grid[i][j]);
      }
      System.out.println();
    }
  }
}
