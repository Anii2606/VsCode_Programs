package com.Arrays;

public class InsertionSrtArr {

  public static void main(String[] args) {
    int[] ray = { 12, 11, 4, 6, 0, 2 };
    int hold;
    for (int i = 1; i < ray.length; i++) {
      hold = ray[i];
      int j = i;
      while (j > 0 && ray[j - 1] > hold) {
        ray[j] = ray[j - 1];
        j--;
      }
      ray[j] = hold;
    }
    for (int k : ray) {
      System.out.print(k + " ");
    }
  }
}
