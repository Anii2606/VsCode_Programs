package com.methods;

import java.util.Scanner;

public class AreaOfTriangleByMethod {

  static float a, b, c;

  public static void main(String[] args) {
    TriangleArea ta = new TriangleArea();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Three Side Of Triangle ");
    System.out.print("side 1 :");
    a = sc.nextFloat();
    System.out.print("side 2 :");
    b = sc.nextFloat();
    System.out.print("side 3 :");
    c = sc.nextFloat();
    ta.semiperameter(a, b, c);
    ta.area(a, b, c);
    System.out.println("The Area of triangle is :" + Math.sqrt(ta.v));
  }
}
