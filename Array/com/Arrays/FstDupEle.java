package com.Arrays;

import java.util.Scanner;

public class FstDupEle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size ");
    int in = sc.nextInt();
    int[] arrSize = new int[in];
    //input
    for (int i = 0; i < in; i++) {
      System.out.print("enter value of " + i + " :");
      arrSize[i] = sc.nextInt();
    }
    int temp = 0;
    for (int i = 0; i < arrSize.length - 1; i++) {
      for (int j = i + 1; j < arrSize.length; j++) {
        if (arrSize[i] == arrSize[j]) {
          System.out.print("The First Duplicate Element is :" + arrSize[j]);
          temp++;
          break;
        }
      }
      if (temp > 0) {
        break;
      }
    }
  }
}
