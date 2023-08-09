package com.Arrays;

import java.util.Scanner;

// Ascending Order Bubble SrtArr
public class AscenOBubbleSrtArr {

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
    //Acending Order
    for (int i = 0; i < bu.length - 1; i++) {
      for (int j = 0; j < bu.length - 1 - i; j++) {
        if (bu[j] > bu[j + 1]) {
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

    System.out.print(" Acending Order [ ");
    for (int i : bu) {
      System.out.print(i + " ");
    }
    System.out.println("]");
  }
}
