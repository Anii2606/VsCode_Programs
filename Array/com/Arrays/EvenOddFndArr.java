package com.Arrays;

//import java.util.*;

public class EvenOddFndArr {

  public static void main(String[] args) {
    int[] array = { 1, 5, 3, 6, 2, 4, 6, 10, 8 };
    System.out.print("Even :");
    int temp = 0;
    for (int i = 0; i < array.length; i++) {
      //for (int j = i + 1; j < array.length; j++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i] + " ");
      }
    }
    for (int j = 0; j < array.length; j++) {
      for (int j2 = j + 1; j2 < array.length; j2++) {
        if (array[j] > array[j2]) {
          temp = array[j2];
          array[j2] = array[j];
          array[j] = temp;
        }
      }
    }
    int total1 = 0;
    for (int i : array) {
      total1 = total1 + i;
    }
    System.out.println("The even number is : " + array.length);
    System.out.println("Total of even is : " + total1);
    System.out.println("--------------------------------------------");

    System.out.print("Odd :");
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        System.out.print(array[i] + " ");
      }
    }
    for (int j = 0; j < array.length; j++) {
      for (int j2 = j + 1; j2 < array.length; j2++) {
        if (array[j] > array[j2]) {
          temp = array[j2];
          array[j2] = array[j];
          array[j] = temp;
        }
      }
    }
    int total2 = 0;
    for (int i : array) {
      total2 = total2 + i;
    }
    System.out.println("The Odd number is : " + array.length);
    System.out.println("Total of Odd is : " + total2);
    // Arrays.sort(array);
    // System.out.print(array[i] + " ");
  }
}
