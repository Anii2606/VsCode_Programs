package com.learnString;

public class PrintStr {

  public static void main(String[] args) {
    String a = "Anikesh";
    String b = "Yatish";
    String aa = " ";
    String bb = " ";

    for (int i = 0; i < a.length() || i < b.length(); i++) {
      if (i < a.length()) {
        System.out.print(a.charAt(i));
      }
      if (i < b.length()) {
        System.out.print(b.charAt(i));
      }
    }
  }
}
