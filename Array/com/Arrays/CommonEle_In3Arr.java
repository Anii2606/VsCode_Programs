package com.Arrays;

import java.util.ArrayList;

public class CommonEle_In3Arr {

  // duplicate Element in three Array

  public static void main(String[] args) {
    int[] arr1 = { 12, 13, 14, 15, 16 };
    int[] arr2 = { 11, 12, 13, 16, 25, 26 };
    int[] arr3 = { 12, 13, 14, 15, 16 };
    ArrayList<Integer> al = new ArrayList<>();
    int x = 0, y = 0, z = 0;
    while (x < arr1.length && y < arr2.length && z < arr3.length) {
      if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
        al.add(arr1[x]);
        x++;
        y++;
        z++;
      } else if (arr1[x] < arr2[y]) {
        x++;
      } else if (arr2[y] < arr3[z]) {
        y++;
      } else {
        z++;
      }
    }
    System.out.println("In The Three Arrays Commen Element is :" + al);
  }
}
