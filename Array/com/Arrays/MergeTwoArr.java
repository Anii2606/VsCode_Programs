package com.Arrays;

import java.util.Scanner;

public class MergeTwoArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size Array01 ");
    int size1 = sc.nextInt();
    int[] arr1 = new int[size1];
    System.out.println("Enter Size Array02");
    int size2 = sc.nextInt();
    int[] arr2 = new int[size2];
    int len1 = arr1.length;
    int len2 = arr2.length;
    int len3 = arr1.length + arr2.length;
    int[] arr3 = new int[len3];
    System.out.println("Enter Element for Array 01 :");
    for (int i = 0; i < len1; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter Element for Array 02 :");
    for (int j = 0; j < len2; j++) {
      arr2[j] = sc.nextInt();
    }
    for (int i = 0; i < len1; i++) {
      arr3[i] = arr1[i];
    }
    for (int j = 0; j < len2; j++) {
      arr3[len1 + j] = arr2[j];
    }
    System.out.println("After Merging ");
    for (int i : arr3) {
      System.out.print(i + " ");
    }
  }
}
