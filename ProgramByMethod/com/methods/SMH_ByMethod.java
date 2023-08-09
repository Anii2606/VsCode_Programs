//Write a Java method to find the smallest number among three numbers.
package com.methods;

import java.util.Scanner;

public class SMH_ByMethod {

  int high;
  int middile;
  int small;

  public int highest(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        //System.out.println("Smallest is :"+a);
        high = a;
      } else {
        //System.out.println("Smallest is :"+c);
        high = c;
      }
    } else {
      if (b > c) {
        //System.out.println("Smallest is :"+b);
        high = b;
      } else {
        // System.out.println("smallest is :"+c);
        high = c;
      }
    }
    return high;
  }

  public int middilest(int a, int b, int c) {
    if (a >= b && a <= c || a >= c && a <= b) {
      middile = a;
    } else if (b <= a && b >= c || b >= a && b <= c) {
      //System.out.println("Smallest is :"+a);
      middile = b;
    } else {
      //System.out.println("Smallest is :"+c);
      middile = c;
    }
    return middile;
  }

  public int smallest(int a, int b, int c) {
    if (a < b) {
      if (a < c) {
        //System.out.println("Smallest is :"+a);
        small = a;
      } else {
        //System.out.println("Smallest is :"+c);
        small = c;
      }
    } else {
      if (b < c) {
        //System.out.println("Smallest is :"+b);
        small = b;
      } else {
        // System.out.println("smallest is :"+c);
        small = c;
      }
    }
    return small;
  }

  public static void main(String[] args) {
    SMH_ByMethod me = new SMH_ByMethod();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter Second number");
    int b = sc.nextInt();
    System.out.println("Enter Third number");
    int c = sc.nextInt();

    me.smallest(a, b, c);
    me.middilest(a, b, c);
    me.highest(a, b, c);
    System.out.println("Smallest  is :" + me.small);
    System.out.println(" middilest is :" + me.middile);
    System.out.println(" highest   is :" + me.high);
  }
}
