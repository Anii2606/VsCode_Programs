package com.methods;

//import java.util.Scanner;

public class TriangleArea {

  float s;
  float v;
  float aroftria;

  float semiperameter(float a, float b, float c) {
    s = (a + b + c) / 2;
    System.out.println("Semiperameter is :" + s);
    return s;
  }

  float area(float x, float y, float z) {
    v = s * (s - x) * (s - y) * (s - z);
    return v;
  }
  //  static float scanner(float a, float b, float c) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter Three Side Of Triangle ");
  //   System.out.print("side 1");
  //   a = sc.nextFloat();
  //   System.out.print("side 2");
  //   b = sc.nextFloat();
  //   System.out.print("side 3");
  //   c = sc.nextFloat();
  //   return a;
  //   return b;
  //   return c;

  //   }
}
