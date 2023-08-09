// Write a Java program to sort a numeric array and a string array.
package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers for Array");
    // input for number Array size creation
    int num = sc.nextInt();
    int[] numArr = new int[num];
    //////////////////////////////////////////////
    // For Number Array element input
    System.out.println("Enter numbers ");
    for (int k = 0; k < numArr.length; k++) {
      numArr[k] = sc.nextInt();
    }
    ////////////////////////////////////////////
    //// for number Array element output
    // for (int k = 0; k < numArr.length; k++) {
    //   System.out.print(numArr[k] + " ");
    // }
    /////////////////////////////////////////
    // input for String Array size creation
    System.out.println("Enter String for Array");
    int str = sc.nextInt();
    String[] strArr = new String[str];
    ///////////////////////////////////////////////
    // for String Array element input
    System.out.println("Enter Strings");
    for (int k = 0; k < str; k++) {
      strArr[k] = sc.nextLine();
    }
    //////////////////////////////////////////////////
    // for String Array element output
    // for (int k = 0; k < strArr.length; k++) {
    //   System.out.print(strArr[k]+" ");
    // }
    ///////////////////////////////////////////
    // for number Array element output
    System.out.println(" Before number Array Squence");
    for (int i : numArr) {
      System.out.print(i + ":" + " ");
    }
    //////////////////////////////////////////
    System.out.println("\n");
    //for String Array element output
    System.out.println(" Before String  Array Squence");
    for (String i : strArr) {
      System.out.print(i + ":" + " ");
    }
    ////////////////////////////////////////////
    System.out.println("\n");
    // for Array elements sorting
    Arrays.sort(numArr);
    Arrays.sort(strArr);
    //////////////////////////////
    //for number Array element output After the sort array element
    System.out.println(" After number Array Squence");
    for (int j : numArr) {
      System.out.print(j + ":" + " ");
    }
    ////////////////////////////////////////////////
    System.out.println("\n");
    //for String Array element output After the sort array eleme
    System.out.println(" After String Array Squence");
    for (String j : strArr) {
      System.out.print(j + ":" + " ");
    }
    ///////////////////////////////////////////////
  }
}
