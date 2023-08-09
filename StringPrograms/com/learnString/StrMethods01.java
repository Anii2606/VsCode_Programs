package com.learnString;

import java.util.Scanner;

public class StrMethods01 {

  // length() Method
  public void method1() {
    System.out.println("Method 1");
    Scanner ac = new Scanner(System.in);
    System.out.print("Enter Name : ");
    String name = ac.nextLine();
    int length = name.length();
    System.out.println("Name of " + name + " whose length is :" + length);
    if (length == 0) { // length mehtod is not work when String value is null
      System.out.println("Nothing in Name");
    }
    method2();
  }

  //////////////////////////////////////////////////////
  public void method2() {
    System.out.println("Method 2");
    Scanner ac = new Scanner(System.in);
    System.out.print("Enter Name : ");
    String name = ac.nextLine();
    int length = name.length();
    if (name.isEmpty() == true) { // return boolean value
      System.out.println("Nothing in Name");
    }
    System.out.println("Name of " + name + " whose length is :" + length);
    method3();
  }

  //////////////////////////////////////////////////////
  public void method3() {
    System.out.println("Method 3");
    Scanner ac = new Scanner(System.in);
    System.out.print("Enter Name : ");
    String name = ac.nextLine();
    int length = name.length();
    System.out.println("Name of " + name + " whose length is :" + length);
    name = name.trim();
    length = name.length();
    // System.out.println(
    //  "After Trim() " + "Name of " + name + " whose length is :" + length
    //);
    if (name.trim().length() == 0) { // return boolean value
      System.out.println("Nothing in Name");
    }
    System.out.println(
      "After Trim() " + "Name of " + name + " whose length is :" + length
    );
  }

  /////////    //////////    ////////////   /////////////  ////
  public static void main(String[] args) {
    StrMethods01 st = new StrMethods01();
    st.method1();
  }
}
