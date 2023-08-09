package com.Arrays;

import java.util.Arrays;

public class Traversing_1D_Arr {

  public static void main(String[] args) {
    // For 1-D Array
    int[] arr = { 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    String[] arr1 = { "Anikesh", "Bharti", "Shivam", "shubham", "Amit", "Ram" };
    // by toString Method
    System.out.println("By toString Method :\n");
    System.out.println(Arrays.toString(arr));
    System.out.print(Arrays.toString(arr1));
    // by for each loop

    System.out.println("\n");
    System.out.println("By foreach Loop :\n");
    for (int ar : arr) {
      System.out.print(ar + " ");
    }
    System.out.println();
    for (String string : arr1) {
      System.out.print(string + " ");
    }

    System.out.println("\n");
    System.out.println("By Normal for Loop :\n");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
}
