package com.Arrays;

public class ArrSelectionSrtAsceOr {

  public static void main(String[] args) {
    int[] arr = new int[] { 12, 11, 67, 90, 0, 4, 34 };
    int temp = 0;
    int a;
    for (int i = 0; i < arr.length; i++) {
      a = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[a]) {
          a = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[a];
      arr[a] = temp;
    }
    for (int j : arr) {
      System.out.print(j + " ");
    }
  }
}
