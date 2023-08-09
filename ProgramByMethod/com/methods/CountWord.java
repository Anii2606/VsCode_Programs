package com.methods;

import java.util.Scanner;

public class CountWord {

  int count = 1;
  String words;

  public static void main(String[] args) {
    CountWord w = new CountWord();
    w.word();
  }

  public void word() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter words :");
    words = sc.nextLine();
    for (int i = 0; i < words.length() - 1; i++) {
      if ((words.charAt(i) == ' ') && (words.charAt(i + 1) != ' ')) {
        count++;
      }
    }

    System.out.print("Words is :" + count);
  }
}
