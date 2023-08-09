// Write a Java program to get the character at the given index within the string.

package com.learnString;

import java.util.Scanner;

public class Str_IndexPossion {

  String p;
  String index = " ";
  String inde = " ";
  int index1;
  int index2;

  public String str(String p) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any String Value : ");
    p = sc.nextLine();
    System.out.print("Enter your Index possion : ");
    index1 = sc.nextInt();
    System.out.println(
      "If you want More possion of String so Say Yes Otherwise Say No"
    );
    String a = sc.next();
    if (a == "yes") {
      System.out.print("Enter your Index possion : ");
      index2 = sc.nextInt();
    }

    index = index + p.charAt(index1);
    inde = inde + p.charAt(index2);
    return index;
  }

  public static void main(String[] args) {
    Str_IndexPossion sip = new Str_IndexPossion();
    sip.str(sip.p);
    System.out.println(
      "Character on :" + sip.index1 + " Index possion is : " + sip.index
    );
    System.out.println(
      "Character on :" + sip.index2 + " Index possion is : " + sip.inde
    );
  }
}
