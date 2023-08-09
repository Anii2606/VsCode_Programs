package com.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DplicteByCollHshMp {

  public static void main(String[] args) {
    int[] arr = { 12, 12, 34, 56, 78, 56, 78, 12 };
    Map<Integer, Integer> s = new HashMap<>();
    for (int i : arr) {
      Integer n = s.get(i);
      if (n == null) {
        s.put(i, 1);
      } else {
        n++;
        s.put(i, n);
      }
    }
    System.out.print("duplicate Elements :");
    Set<Map.Entry<Integer, Integer>> se = s.entrySet();
    for (Map.Entry<Integer, Integer> entry : se) {
      if (entry.getValue() > 1) {
        System.out.print(entry.getKey() + " ");
      }
    }
  }
}
