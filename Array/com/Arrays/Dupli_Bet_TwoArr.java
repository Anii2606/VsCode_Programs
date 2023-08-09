package com.Arrays;

public class Dupli_Bet_TwoArr {

  // find Common Element
  public static void main(String[] args) {
    int[] arr1 = { 1, 12, 17, 19, 3, 6, 0 };
    int[] arr2 = { 4, 5, 6, 1, 7, 8, 9, 0 };

    System.out.print("Duplicate Element is :");

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          System.out.print(arr1[i] + ",");
        }
      }
    }
  }
}
