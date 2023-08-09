package com.Arrays;

public class StringSortByBubble {

  public static void main(String[] args) {
    //StringSortByBubble st = new StringSortByBubble();
    String[] str = {
      "yatish",
      "bassi",
      "manan",
      "nitesh",
      "anikesh",
      "hitesh",
      "shubham",
    };
    String temp;
    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j < str.length - 1 - i; j++) {
        if (str[j].compareTo(str[j + 1]) > 0) {
          temp = str[j];
          str[j] = str[j + 1];
          str[j + 1] = temp;
        }
      }
      //   if (f == 0) {
      //     break;
      //   }
    }
    for (String string : str) {
      System.out.print(string + " ");
    }
  }
}
