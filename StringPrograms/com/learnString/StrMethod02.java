package com.learnString;

import java.util.Scanner;

public class StrMethod02 {

  public void method1() {
    System.out.println("Method 1");
    Scanner ac = new Scanner(System.in);
    System.out.println("Enter Name 01: ");
    String name1 = ac.nextLine();
    System.out.println("Enter Name 02 ");
    String name2 = ac.nextLine();
    name1 = name1.trim();
    name2 = name2.trim();

    //////////////////////////////////////////////////////////
    //int length = name.length();
    //System.out.println();
    // if (name1.equals(name2)) { // length mehtod is not work when String value is null
    //   System.out.println(name1 + " and " + name2 + " are Equals");
    // } else {
    //   System.out.println(name1 + " and " + name2 + " are Not Equals");
    // }

    /////////////////////////////////////////////////////////////

    if (name1.equalsIgnoreCase(name2)) { // length mehtod is not work when String value is null
      System.out.println(name1 + " and " + name2 + " are Equals");
    } else {
      System.out.println(name1 + " and " + name2 + " are Not Equals");
    }
    method2();
  }

  public void method2() {
    System.out.println("Method 2");
    Scanner ac = new Scanner(System.in);
    System.out.println("Enter Name 01: ");
    String name1 = ac.nextLine();
    System.out.println("Enter Name 02 ");
    String name2 = ac.nextLine();

    ////////////////////////////////////////////////////////////////
    //     if (name1.compareTo(name2) == 0) {
    //       System.out.println(name1 + " and " + name2 + " are Equals");
    //     } else if (name1.compareTo(name2) > 0) {
    //       System.out.println(
    //         name1 + " is Greater than " + name2 + " " + name1.compareTo(name2)
    //       );
    //     } else {
    //       System.out.println(name1 + " is Smaller than  " + name2);
    //     }
    //   }
    ////////////////////////////////////////////////////////////

    if (name1.compareToIgnoreCase(name2) == 0) {
      System.out.println(name1 + " and " + name2 + " are Equals");
    } else if (name1.compareTo(name2) > 0) {
      System.out.println(
        name1 +
        " is Greater than " +
        name2 +
        " " +
        name1.compareToIgnoreCase(name2)
      );
    } else {
      System.out.println(
        name1 +
        " is Smaller than  " +
        name2 +
        " " +
        name1.compareToIgnoreCase(name2)
      );
    }
  }

  public static void main(String[] args) {
    StrMethod02 sm = new StrMethod02();
    sm.method1();
  }
}
