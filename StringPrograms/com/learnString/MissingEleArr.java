package com.learnString;

import java.util.Scanner;

public class MissingEleArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Give a array size :");
    int size = sc.nextInt();
    int[] ar = new int[size];
    System.out.println("Enter Elemnts :");
    for (int i = 0; i < ar.length; i++) {
      ar[i] = sc.nextInt();
    }
    // int[] ar = { 1, 2, 3, 5, 6, 7, 8 };
    int len = ar.length + 1;
    int totalSum = (len * (len + 1)) / 2;
    // System.out.print(totalSum + " ");
    int sum = 0;
    for (int i = 0; i < ar.length; i++) {
      sum = sum + ar[i];
    }
    int p = totalSum - sum;
    System.out.println("Missing Element is :" + p);
  }
}
