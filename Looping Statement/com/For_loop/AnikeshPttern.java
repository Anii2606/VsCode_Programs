/*
 
    *      
   *  *    
  ******   
 *      *  
*        * 


*     *    
* *   *    
*  *  *    
*   * *    
*     *    


 * * * * * 
     *     
     *     
     *     
 * * * * * 


*   *      
*  *
* *
**
*
**
* *
*  *
*   *


* * * *
*
*
* * * *
*
*
* * * *


* * * * *
*
*
*
* * * * *
        *
        *
        *
* * * * *

*       *
*       *
* * * * *
*       *
*       *

 */

public class AnikeshPttern {

  public static void main(String[] args) {
    a();
    n();
    i();
    k();
    e();
    s();
    h();
  }

  public static void a() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 4; j >= i; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      if (i == 3) {
        for (int k = 1; k < 2; k++) {
          System.out.print("****");
        }
      }
      if (i != 3) {
        for (int k = 2; k < i * 2; k++) {
          System.out.print(" ");
        }
      }
      if (i != 1) {
        System.out.println("*");
      }
      if (i == 1) {
        System.out.println();
      }
    }
    System.out.println("\n");
  }

  /////////////////////////////////////////////////////////////////////////
  public static void n() {
    for (int i = 1; i <= 5; i++) {
      System.out.print("*");

      for (int j = 2; j <= i; j++) {
        System.out.print(" ");
      }
      if (i != 1 && i != 5) {
        System.out.print("*");
      }
      if (i == 5) {
        System.out.print(" ");
      }
      if (i == 1) {
        System.out.print(" ");
      }
      for (int j = 4; j >= i; j--) {
        System.out.print(" ");
      }

      System.out.println("*");
    }
    System.out.println("\n");
  }

  //////////////////////////////////////////////////////////////
  public static void i() {
    for (int i = 1; i <= 5; i++) {
      if (i == 1 || i == 5) {
        for (int j = 1; j <= 5; j++) {
          System.out.print(" *");
        }
      }
      if (i != 1 && i != 5) {
        for (int j = 1; j < 3; j++) {
          System.out.print(" ");
        }
        System.out.print("   *");

        for (int j = 1; j < 3; j++) {
          System.out.print(" ");
        }
      }
      System.out.println(" ");
    }
    System.out.println("\n");
  }

  ///////////////////////////////////////////////////////
  public static void k() {
    for (int i = 1; i <= 5; i++) {
      System.out.print("*");

      for (int j = 3; j >= i; j--) {
        System.out.print(" ");
      }
      if (i != 5) {
        System.out.println("*");
      }
    }
    System.out.println();
    for (int i = 1; i <= 4; i++) {
      System.out.print("*");
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.println("\n");
  }

  ////////////////////////////////////////////////////////
  public static void e() {
    for (int i = 1; i <= 7; i++) {
      System.out.print("*");
      if (i == 1 || i == 4 || i == 7) {
        for (int j = 1; j < 4; j++) {
          System.out.print(" *");
        }
      }
      System.out.println();
    }
    System.out.println("\n");
  }

  ///////////////////////////////////////////
  public static void s() {
    for (int i = 1; i <= 5; i++) {
      System.out.print("*");
      if (i == 1 || i == 5) {
        for (int j = 1; j <= 4; j++) {
          System.out.print(" *");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= 4; i++) {
      if (i != 4) {
        for (int j = 1; j <= 7; j++) {
          System.out.print(" ");
        }
      }
      if (i == 4) {
        System.out.print("*");
        for (int j = 1; j <= 4; j++) {
          System.out.print(" *");
        }
      }
      if (i != 4) {
        System.out.println(" *");
      }
    }
    System.out.println("\n");
  }

  ///////////////////////////////////////
  public static void h() {
    for (int i = 1; i <= 3; i++) {
      System.out.print("*");
      if (i != 3) {
        for (int j = 1; j <= 6; j++) {
          System.out.print(" ");
        }
      }
      if (i == 3) {
        for (int j = 1; j <= 3; j++) {
          System.out.print(" *");
        }
      }
      System.out.print(" *");
      System.out.println();
    }
    for (int i = 1; i <= 2; i++) {
      System.out.print("*");
      for (int j = 1; j <= 7; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
