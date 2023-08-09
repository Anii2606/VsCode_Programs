package com.Arrays;

import java.util.Arrays;

public class Traversing_2D_Arr {

  public static void main(String[] args) {
    // For 2-D Array
    int[][] arr = { { 12, 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
    String[][] arr1 = {
      { "Anikesh", "Bharti", "Shivam" },
      { "shubham", "Amit", "Ram" },
    };
    // by toString Method
    System.out.println("By toString Method :\n");
    System.out.println(Arrays.toString(arr[0]));
    System.out.print(Arrays.toString(arr[1]));
    System.out.println();
    System.out.println(Arrays.toString(arr1[0]));
    System.out.print(Arrays.toString(arr1[1]));
    // by for each loop

    System.out.println("\n");
    System.out.println("By foreach Loop :\n");
    for (int[] ar : arr) {
      for (int a : ar) {
        System.out.print(a + "\t");
      }
      System.out.println();
    }
    System.out.println();
    for (String[] string : arr1) {
      for (String strings : string) {
        System.out.print(strings + "\t");
      }
      System.out.println();
    }
    // By normal for loop
    System.out.println("\n");
    System.out.println("By Normal for Loop :\n");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.print(arr1[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
