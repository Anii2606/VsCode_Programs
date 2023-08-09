public class Pattern_12 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      /*
    
*       *
 *     *
  *   *
   * *
    *
             */
      // for(int j=1;j<i;j++){
      // System.out.print(" ");
      // }
      // System.out.print("*");
      // for(int k=5;k>i;k--){
      // System.out.print(" ");
      // }
      // for(int l=4;l>i;l--){
      // System.out.print(" ");
      // }
      // if(i!=5){
      // System.out.print("*");
      // }
      // System.out.println();
      /*

             *
            * *
           *   *
          *     *
         *       *
         
             */

      // for (int j1 = 5; j1 > i; j1--) {
      //     System.out.print(" ");
      // }
      // for (int k = 1; k <= i * 2; k++) {
      //     if (k > 1 && k < i * 2 - 1) {
      //         System.out.print(" ");
      //     } else {
      //         System.out.print("*");
      //     }
      // }

      for (int j1 = 5; j1 > i; j1--) {
        System.out.print(" ");
      }
      if (i != 1) {
        System.out.print("*");
      }
      for (int k1 = 2; k1 <= i; k1++) {
        System.out.print(" ");
      }
      if (i == 2) {
        System.out.print("*");
      }
      for (int l1 = 3; l1 <= i; l1++) {
        System.out.print(" ");
      }
      if (i == 3 || i == 4 || i == 5) {
        System.out.print("*");
      }
      System.out.println();
    }
    //  System.out.println();
  }
}
