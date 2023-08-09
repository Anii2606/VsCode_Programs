package com.Arrays;

public class MaxMinFndArr {

  public static void main(String[] args) {
    int[] arr = { 12, 13, 14 };
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Maximum element is :" + max);
    int[] arr2 = { 12, 13, 14 };
    int min = arr2[0];
    for (int i = 1; i < arr2.length; i++) {
      if (arr2[i] < min) {
        min = arr2[i];
      }
    }
    System.out.println("minimum element is :" + min);
  }
}
