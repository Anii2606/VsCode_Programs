package com.Arrays;

import java.util.Arrays;

public class Traversing_3D_Arr {

  public static void main(String[] args) {
    // For 2-D Array
    int[][][] arr = {
      { { 12, 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } },
    };
    String[][][] arr1 = {
      {
        { "Anikesh", "Bharti", "Shivam" },
        { "shubham", "Amit", "Ram" },
        { "Aditi", "Yatish", "Khusi" },
      },
    };
    // by toString Method
    System.out.println("By toString Method :\n");
    System.out.println(Arrays.toString(arr[0][0]));
    System.out.println(Arrays.toString(arr[0][1]));
    System.out.println(Arrays.toString(arr[0][2]));
    System.out.println();
    System.out.println(Arrays.toString(arr1[0][0]));
    System.out.println(Arrays.toString(arr1[0][1]));
    System.out.println(Arrays.toString(arr1[0][2]));
    // by for each loop

    System.out.println("\n");
    System.out.println("By foreach Loop :\n");
    for (int[][] ar : arr) {
      for (int[] a : ar) {
        for (int a1 : a) {
          System.out.print(a1 + " ");
        }
        System.out.println();
      }
    }
    System.out.println();
    for (String[][] string : arr1) {
      for (String[] strings : string) {
        for (String strings2 : strings) {
          System.out.print(strings2 + " ");
        }
        System.out.println();
      }
    }
    // By normal for loop
    System.out.println("\n");
    System.out.println("By Normal for Loop :\n");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.print(arr[i][j][k] + " ");
        }
        System.out.println();
      }
    }
    System.out.println();
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        for (int k = 0; k < arr1[i][j].length; k++) {
          System.out.print(arr1[i][j][k] + " ");
        }
        System.out.println();
      }
    }
  }
}
