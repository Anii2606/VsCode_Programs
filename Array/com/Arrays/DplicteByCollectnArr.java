package com.Arrays;

import java.util.*;

// this is called Set Interface
public class DplicteByCollectnArr {

  //it is also  Only for 2 duplicate element if element is three that it will repeate the element ;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size ");
    int in = sc.nextInt();
    int[] arrSize = new int[in];
    //input
    for (int i = 0; i < in; i++) {
      System.out.print("enter value of " + i + " :");
      arrSize[i] = sc.nextInt();
    }
    System.out.print("Duplicate is :");
    // Hashset is predifine class in java
    Set<Integer> s = new HashSet<>();
    for (Integer s1 : arrSize) {
      if (s.add(s1) == false) {
        System.out.print(s1 + " ");
      }
    }
  }
}
