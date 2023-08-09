package com.learnString;

public class SimpleStrProg {

  public static void main(String[] args) {
    final int aa = 20;
    System.out.println(aa);
    System.out.println(aa);
    String a = new String("Anikesh");
    System.out.println(a);
    String b = new String("Anikesh");
    System.out.println(b);
    if (a.equals(b)) {
      System.out.println("Equals");
    } else {
      System.out.println("Not Equals");
    }
    String sb = new String("Bharti");
    sb = sb + " Java";
    //.concat(" java");
    sb = sb + " " + 917990103;
    //.concat(" " + 20);
    System.out.print(sb);
  }
}
