package com.methods;

import java.util.Scanner;

public class CountVowels {

  static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any String Value :");
    String vow = sc.nextLine();
    CountVowels.vowel(vow);
    System.out.print("Vowels is :" + count);
  }

  public static String vowel(String vow) {
    for (int i = 0; i < vow.length(); i++) {
      if (
        vow.charAt(i) == 'a' ||
        vow.charAt(i) == 'i' ||
        vow.charAt(i) == 'o' ||
        vow.charAt(i) == 'u' ||
        vow.charAt(i) == 'e'
      ) {
        count++;
      } else if (
        vow.charAt(i) == 'A' ||
        vow.charAt(i) == 'I' ||
        vow.charAt(i) == 'O' ||
        vow.charAt(i) == 'U' ||
        vow.charAt(i) == 'E'
      ) {
        count++;
      }
    }
    return vow;
  }
}
