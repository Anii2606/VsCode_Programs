package com.Arrays;

import java.util.Arrays;

public class Scnd_Lgst_EleArr {

  public static void main(String[] args) {
    int[] arr = { 12, 10, 7, 3, 2, 99 };
    int temp;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      if (i == 1) {
        break;
      }
    }
    System.out.print(
      "(Descending order)Sorted List is : " + Arrays.toString(arr)
    );
    //  System.out.println();
    // System.out.println("The First largest element is :" + arr[0]);
    System.out.println("The Second largest element is :" + arr[1]);
  }
}
