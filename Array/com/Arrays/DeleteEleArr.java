package com.Arrays;

import java.util.Scanner;

public class DeleteEleArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number for Array Size");
    int num = sc.nextInt();
    //int a = 1;
    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Orignal Array is :");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Enter index number");
    int index = sc.nextInt();
    for (int i = 0; i < arr.length - 1; i++) {
      if (i == index) {
        for (int j = i; j < arr.length - 1; j++) {
          arr[j] = arr[j + 1];
        }
        break;
      }
      //a--;
    }
    System.out.print("After Deletion Array is :");
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print(arr[i] + " ");
    }
    // for (int j : arr) {
    //   System.out.print(j + " ");
    // }
  }
}
