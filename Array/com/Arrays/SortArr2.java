package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    System.out.print("Enter 10 integer Element : ");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    //  for (int i = 0; i < a.length; i++) {
    //   System.out.println( a[i]+" ");
    //  }

    // a[0] = 2000;
    // a[1] = 1900;
    // a[3] = 2010;
    // a[4] = 1200;
    // a[5] = 1800;
    // a[6] = 3000;
    // a[7] = 1980;
    // a[8] = 2000;
    // a[9] = 4400;

    System.out.println("Oringal value of a:" + Arrays.toString(a));
    Arrays.sort(a);
    System.out.println(
      "After Sorting the value of a is  :" + Arrays.toString(a)
    );
    //a[10] = 2000; // ArrayIndexOutOfBoundsException

    // for (int i = 0; i < a.length; i++) {
    //   System.out.println(a[i]);
    // }

    String[] b = new String[10];
    System.out.print("Enter 10 String Element : ");
    for (int i = 0; i < a.length; i++) {
      b[i] = sc.nextLine();
    }
    //  for (int i = 0; i < a.length; i++) {
    //   System.out.print( b[i]+" ");
    //  }

    // b[0] = "Ram";
    // b[1] = "Shyam";
    // b[2] = "Radhe";
    // b[3] = "Shiva";
    // b[4] = "Bholenath";
    // b[5] = "Krishna";
    // b[6] = "Vasudev";
    // b[7] = "Narsingh";
    // b[8] = "HanumanJi";
    // b[9] = "Jaggannath";

    System.out.println("Oringal value of b:" + Arrays.toString(b));
    Arrays.sort(b);
    System.out.println(
      "After Sorting the value of b is  :" + Arrays.toString(b)
    );
    // b[10] = "RadheRadhe"; // ArrayIndexOutOfBoundsException
    // for (int i = 0; i < b.length; i++) {
    //   System.out.println(b[i]);
    // }

  }
}
