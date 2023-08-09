package com.Arrays;

import java.util.Scanner;

public class descenOBubbleSrtArr {

  // descending Order Bubble SrtArr
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Array Size :");
    int size = sc.nextInt();
    int[] bu = new int[size];

    System.out.println("Enter elements");
    for (int i = 0; i < bu.length; i++) {
      bu[i] = sc.nextInt();
    }

    int temp;
    int ff = 0;
    //Descending Order
    for (int i = 0; i < bu.length; i++) {
      for (int j = 0; j < bu.length - 1; j++) {
        if (bu[j] < bu[j + 1]) {
          temp = bu[j];
          bu[j] = bu[j + 1];
          bu[j + 1] = temp;
          ff = 1;
        }
      }
      if (ff == 0) {
        break;
      }
    }
    System.out.print(" Decsending Order[ ");
    for (int i : bu) {
      System.out.print(i + " ");
    }
    System.out.print("]");
  }
}
