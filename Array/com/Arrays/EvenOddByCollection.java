package com.Arrays;

import java.util.*;

//import java.util.ArrayList;

public class EvenOddByCollection {

  public static void main(String[] args) {
    int[] arr = { 3, 1, 2, 5, 4, 7, 9, 0, 8, 6 };
    ArrayList<Integer> ar1 = new ArrayList<>();
    ArrayList<Integer> ar2 = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        ar1.add(arr[i]);
      } else {
        ar2.add(arr[i]);
      }
    }
    int total1 = 0;
    System.out.println("The Even Element is :" + ar1.size());
    System.out.println("Even number is : " + ar1);
    for (int exp1 : ar1) {
      total1 = total1 + exp1;
    }
    System.out.println("Total of even number is " + total1);
    System.out.println(
      "------------------------------------------------------------"
    );
    System.out.println("The Odd Element is :" + ar2.size());
    System.out.println("Odd number is :" + ar2);
    int total2 = 0;

    for (int exp2 : ar2) {
      total2 = total1 + exp2;
    }
    System.out.println("Total of Odd number is " + total2 + "\n");
  }
}
