package com.Constracters;

public class DefualtCons {

  // No Argumnet Constracter (Pre-defined)
  int a;
  String name;

  /*

Here compiler genereded a default Constracter Itself if we dont create a costracter for iniliaze value.

DefualtCons(){
    a=0;
    name=null;
}

 */

  ///////////////////////////////////////////////////////////
  // But if we create our own Costacter so Compiler couldn't
  // This is called no argument Costracter but User Defined

  DefualtCons() {
    a = 23;
    name = "Anikesh";
    System.out.println(a);
    System.out.println(name);
  }

  public static void main(String[] args) {
    DefualtCons c = new DefualtCons();
    System.out.println(c.a);
    System.out.println(c.name);
  }
}
