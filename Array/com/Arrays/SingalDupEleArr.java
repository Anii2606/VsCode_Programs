package com.Arrays;

public class SingalDupEleArr {

  public static void main(String[] args) {
    int[] arr = { 5, 3, 4, 2, 3, 4, 5 }; // 5=Integer.Max_value ,
    // System.out.print("Single Duplicate Element is :");
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == Integer.MAX_VALUE) {
        continue;
      }
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr[j] = Integer.MAX_VALUE;
          count++;
          continue;
        }
      }
      if (count == 0) {
        System.out.print("Non Repeated Element " + arr[i] + " ");
      } else {
        count = 0;
      }
      // System.out.println();
      // System.out.print(arr[i] + " ");
    }
  }
}
