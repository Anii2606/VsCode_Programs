package com.Constracters;

public class ConsThisKeyw {

  int a;
  String m;

  ConsThisKeyw(int a) {
    super();
    this.a = a;
    //this.m = n;
    System.out.println(a);
    System.out.println(m);
  }

  public static void main(String[] args) {
    ThisK ck = new ThisK(23);
    ThisK ck1 = new ThisK(15, "Saloni");
  }
}

class ThisK extends ConsThisKeyw {

  int a;

  // String str;

  ThisK(int x, String st) {
    this.a = x;
    // this.str = st;

    System.out.println(x);
    // System.out.println(str);
    // System.out.println(x);
    // System.out.println(st);
  }
}
