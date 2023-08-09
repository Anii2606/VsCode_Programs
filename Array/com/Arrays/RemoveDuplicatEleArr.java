package com.Arrays;

import java.util.HashSet;

public class RemoveDuplicatEleArr {

  public static void main(String[] args) {
    int[] a = { 1, 5, 7, 20, 20, 20, 20, 25, 25, 25, 25, 25 };
    // first way
    //int[] tem = new int[a.length];
    // int j = 0;
    // for (int i = 0; i < a.length - 1; i++) {
    //   if (a[i] != a[i + 1]) {
    //     tem[j] = a[i];
    //     j++;
    //   }
    // }
    // tem[j] = a[a.length - 1];

    // second way
    // int j = 0;
    // for (int i = 0; i < a.length - 1; i++) {
    //   if (a[i] != a[i + 1]) {
    //     a[j] = a[i];
    //     j++;
    //   }
    // }
    // a[j] = a[a.length - 1];
    // for (int i = 0; i < j + 1; i++) {
    //   System.out.print(a[i] + " ");
    // }
    // Third Way
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      hs.add(a[i]);
    }
    for (int h : hs) {
      System.out.print(h + " ");
    }
  }
}
