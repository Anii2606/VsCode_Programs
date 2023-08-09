package com.methods;

import java.util.Scanner;

public class SumOfDigits {

  int total = 0;

  int digit(int a) {
    while (a != 0) {
      int temp = a % 10;
      total = total + temp;
      a = a / 10;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number for digit addition :");
    int num = sc.nextInt();
    SumOfDigits s = new SumOfDigits();
    s.digit(num);
    System.out.print("The sum of all digit is :" + s.total);
  }
}
