package com.Arrays;

import java.util.*;

public class Srt_If_lastDgt_0 {

  public static void main(String[] args) {
    int[] arr = { 12, 10, 300, 11, 100, 111, 1000 };
    int temp;
    int temp1;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1] && arr[j] % 10 == 0 || arr[j + 1] % 10 == 0) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.print("Ascending Order :" + Arrays.toString(arr));
  }
}
