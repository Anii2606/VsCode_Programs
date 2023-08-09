package com.Arrays;

public class MissingEleArr {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 9 };
    // way the XOR

    int fst = a[0];
    for (int i = 1; i < a.length; i++) {
      fst = fst ^ a[i];
    }
    int scnd = 1;
    for (int i = 2; i <= a.length + 1; i++) {
      scnd = scnd ^ i;
    }
    System.out.println("The missing Element is :" + (fst ^ scnd));
  }
}
// Normal way
//     int missEle = a.length + 1;
//     int totalSum = (missEle * (missEle + 1)) / 2; //56/2=28
//     // System.out.println(totalSum);
//     int sum = 0;
//     for (int i = 0; i < a.length; i++) {
//       sum = sum + a[i];
//     }
//     // System.out.println(sum);
//     int ele = totalSum - sum;
//     System.out.println("Missing number is :" + ele);
//   }
// }
