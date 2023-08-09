package com.Arrays;

public class SubArrMaxSum {

  public static void main(String[] args) {
    int[] arr = { 1, -23, 35, -12, -13, -20, 90, 20, -10, -10, 20 };
    int maxSoFar = Integer.MIN_VALUE;
    int maxSum = 0;
    int start = 0;
    int end = 0;
    int s = 0;
    for (int i = 0; i < arr.length; i++) {
      maxSum = maxSum + arr[i];
      if (maxSoFar < maxSum) {
        maxSoFar = maxSum;
        start = s;
        end = i;
      }
      if (maxSum < 0) {
        maxSum = 0;
        s = i + 1;
      }
    }
    System.out.println(maxSum);
    System.out.println(
      "Starting index is :" + start + " And Ending Index is :" + end
    );
  }
}
