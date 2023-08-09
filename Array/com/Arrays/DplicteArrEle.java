package com.Arrays;

import java.util.Scanner;

// That is called Bruth force method
public class DplicteArrEle {

  // Only for 2 duplicate element if element is three that it will not work properly;
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
    int count = 0;
    for (int i = 0; i < arrSize.length - 1; i++) { // 12 12 12 12 12
      for (int j = i + 1; j < arrSize.length; j++) {
        if (arrSize[i] == arrSize[j] && i != j) {
          System.out.print(arrSize[j] + " "); // 12 12 12 12
        } else {
          count++;
        }
      }
      if (count == 0) {
        break;
      } else {
        count = 0;
      }
    }
  }
}
