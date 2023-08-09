package com.Arrays;

import java.util.*;

public class CopyStrArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size ");
    int in = sc.nextInt();
    String[] name = new String[in];
    //input
    for (int i = 0; i < in; i++) {
      System.out.print("enter value of " + i + " :");
      name[i] = sc.next();
    }
    System.out.println("Enter array Duplicate size ");
    int in1 = sc.nextInt();
    String[] name1 = new String[in1];
    for (int i = 0; i < name1.length; i++) {
      name1[i] = name[i];
    }
    System.out.print("duplicate Array element is :");
    // for (String nam : name1) {
    //   System.out.print(nam + " ");
    // }
    System.out.print(Arrays.toString(name1));
  }
}
