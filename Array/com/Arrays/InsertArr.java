// Write a Java program to insert an element (specific position) into an array
package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size ");
    int a = sc.nextInt();
    // a = a + 1;
    int[] arr = new int[a + 1]; //5
    System.out.print("Default values :");
    //System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Fill your values");
    for (int i = 0; i < a; i++) {
      arr[i] = sc.nextInt(); // 12 13 14 12 45
    }
    System.out.print("Orignal Value is : ");
    for (int i = 0; i < a; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    // System.out.println("orignal Array :" + Arrays.toString(arr));
    System.out.println("Enter Index number");
    int index = sc.nextInt(); //3
    // index = index + 1;
    System.out.println("Now Enter Element for insert");
    int element = sc.nextInt(); //100
    for (int i = a; i > index; i--) {
      arr[i] = arr[i - 1];
    }
    arr[index] = element;
    a++;
    System.out.print(Arrays.toString(arr));
    //     for(int i=0;i<arr.length;i++){
    // System.out.println(arr[i]);
    //     }
  }
}
