package com.Arrays;

public class Dupli_Bet_TwoStrArr {

  public static void main(String[] args) {
    String[] str1 = {
      "Shubham",
      "Hitesh",
      "Shivam",
      "Anikesh",
      "Sachin",
      "lalit",
    };
    String[] str2 = { "Shubham", "Hit", "Shivam", "Anikesh", "Sach", "latik" };
    for (int i = 0; i < str1.length; i++) {
      for (int j = 0; j < str2.length; j++) {
        if (str1[i].equals(str2[j])) {
          System.out.print(str1[i] + " ");
        }
      }
    }
  }
}
