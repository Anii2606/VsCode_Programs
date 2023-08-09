package com.Arrays;

import java.util.*;

public class FndKthEle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Arrays size : ");
    int num = sc.nextInt();
    int[] arr = new int[num];
    System.out.print("Enter elements ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("arr[" + i + "] :");
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter index number to get the value : ");
    int k = sc.nextInt();
    int temp;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      if (i == k - 1) {
        System.out.println("Sorted List Is :" + Arrays.toString(arr));
        System.out.print(k + "Th (kth) Index Value is : " + arr[i]);
        break;
      }
    }
  }
}
