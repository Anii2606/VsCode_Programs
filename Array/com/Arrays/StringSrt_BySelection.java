package com.Arrays;

public class StringSrt_BySelection {

  public static void main(String[] args) {
    String[] str = {
      "yatish",
      "bassi",
      "manan",
      "anikesh",
      "chetan",
      "Hitesh",
      "shubham",
    };
    int min;
    String temp;
    for (int i = 0; i < str.length; i++) {
      min = i;
      for (int j = i + 1; j < str.length; j++) {
        //Descending order String Array
        // if (str[j].compareTo(str[min]) < 0) {
        //   min = j;
        // }
        // temp = str[j];
        // str[j] = str[min];
        // str[min] = temp;

        // ascending order String array
        if (str[j].compareTo(str[min]) < 0) {
          min = j;
        }
        temp = str[i];
        str[i] = str[min];
        str[min] = temp;
      }
    }
    for (int i = 0; i < str.length - 1; i++) {
      System.out.print(str[i] + " ");
    }
  }
}
