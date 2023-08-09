package com.Arrays;

import java.util.Scanner;

public class DeleteTwoEleArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Size : ");
    int count = 0;
    int count1 = 0;
    int size = sc.nextInt();
    // System.out.print("Add More Size in  Array: ");
    // int moreSize = sc.nextInt();
    int[] rr = new int[size];
    System.out.println("Take values ");
    for (int i = 0; i < size; i++) {
      rr[i] = sc.nextInt();
    }
    System.out.print("Orignal value is : ");
    for (int i = 0; i < size; i++) {
      System.out.print(rr[i] + " ");
    }
    System.out.println();
    System.out.print("(For Remove) Element 01 : ");
    int index1 = sc.nextInt();
    for (int i = 0; i < rr.length; i++) {
      if (rr[i] == index1) {
        for (int j = i; j < rr.length - 1; j++) {
          rr[j] = rr[j + 1];
        }
        count++;
        break;
      }
    }
    if (count == 0) {
      System.out.println("Element  01 is not Avaliable in Array");
    }
    for (int i = 0; i < rr.length - 1; i++) {
      System.out.print(rr[i] + " ");
    }
    System.out.println();
    System.out.println("Enter Array 02 Size :");
    int size1 = sc.nextInt();
    int[] q = new int[size1];
    for (int i = 0; i < q.length; i++) {
      q[i] = rr[i];
    }
    //This is not work Properly
    System.out.println();
    System.out.print("(For Remove) Element 02 : ");
    int index2 = sc.nextInt();
    for (int j = 0; j < q.length; j++) {
      if (rr[j] == index2) {
        for (int k = j; k < q.length - 1; k++) {
          q[k] = q[k + 1];
        }
        count1++;
        break;
      }
    }

    if (count1 == 0) {
      System.out.println("Element  02 is not Avaliable in Array");
    }
    // for (int i = 0; i < rr.length - 1; i++) {
    //   System.out.print(rr[i] + " ");
    // }
    for (int j = 0; j < q.length - 1; j++) {
      System.out.print(q[j] + " ");
    }
  }
}
