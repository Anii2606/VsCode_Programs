package com.Arrays;

import java.util.Scanner;

public class FndVluByBinarySrch {

  //when list is sorted than Binary search is good aproach ;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size index");
    int in = sc.nextInt();
    int[] num = new int[in];

    //input
    for (int i = 0; i < in; i++) {
      System.out.print("enter value of " + i + " :");
      num[i] = sc.nextInt();
    }

    int li = 0;
    int hi = num.length - 1; //6
    int mi = (li + hi) / 2; //3

    System.out.println("Enter X value");
    int x = sc.nextInt(); //7

    while (li <= hi) { // 0<=6
      if (num[mi] == x) { // num[3]==7 , num[5]=7
        System.out.println("The X is " + mi + " Index");
        break;
      } else if (num[mi] < x) { //num[3]<7
        li = mi + 1; // li = 3+1=4
      } else {
        hi = mi - 1; // hi=3-1=2
      }
      mi = li + hi / 2; // else : mi =4+6==10/2=5
    }
    // for (int i : num) {
    //   System.out.println("The value is at :" + i + "index");
    // }
  }
}
