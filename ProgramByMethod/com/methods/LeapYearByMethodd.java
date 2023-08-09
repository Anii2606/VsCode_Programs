package com.methods;

import java.util.Scanner;

public class LeapYearByMethodd {

  static int year;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any year");
    LeapYear y = new LeapYear();
    year = sc.nextInt();
    y.leap(year);
    System.out.println(year + " is leap year(True/false) :" + y.a);
  }
}

class LeapYear {

  boolean a;

  int leap(int year) {
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          a = true;
        } else {
          a = false;
        }
      } else {
        a = true;
      }
    } else {
      a = false;
    }
    return year;
  }
}
