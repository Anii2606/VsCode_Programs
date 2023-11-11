package com.Constracters;

public class PerameterizedCons {

  public static void main(String[] args) {
    TestPera tp = new TestPera(101);
    TestPera tp1 = new TestPera(89505, 917990103);
    TestPera tp2 = new TestPera("Anikesh Chouhan");
    TestPera tp3 = new TestPera("Ishika Jat", 23);
  }
}

class TestPera {

  TestPera(int num) {
    System.out.println(num);
    System.out.println("//////////////////////////////////////////////");
  }

  TestPera(int num, int num1) {
    System.out.println(num);
    System.out.println(num1);
    System.out.println("//////////////////////////////////////////////");
  }

  TestPera(String name) {
    System.out.println(name);
    System.out.println("//////////////////////////////////////////////");
  }

  TestPera(String name, int num) {
    System.out.println(name);
    System.out.println(num);
    System.out.println("//////////////////////////////////////////////");
  }
}
