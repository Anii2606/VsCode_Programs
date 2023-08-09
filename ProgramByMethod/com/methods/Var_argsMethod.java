package com.methods;

public class Var_argsMethod {

  static int sum = 0;

  static int var(int... arr) {
    for (int a : arr) {
      sum += a;
      //System.out.println("sum is :" + sum);
    }
    return sum;
  }

  public static void main(String[] args) {
    Var_argsMethod va = new Var_argsMethod();
    //  va.var();
    System.out.println("sum is :" + var());
    // va.var(1);
    System.out.println("sum is :" + var(1));
    //va.var(1, 1);
    System.out.println("sum is :" + var(1, 3));
    // va.var(1, 2);
    System.out.println("sum is :" + var(2, 3));
    // va.var(1, 3);
    System.out.println("sum is :" + var(11, 11));
    // va.var(1, 4);
    System.out.println("sum is :" + var(1, 2));
  }
}
