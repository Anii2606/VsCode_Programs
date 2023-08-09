/*
 
*       *
 *     *
  *   *
   * *
    *
  
 */

public class Pattern_11 {
    public static void main(String[] args) {
        // int k=7;
        for (int i = 1; i <= 5; i++) {
            for (int j1 = 1; j1 < i; j1++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // for(int j2=1;j2<=i;j2++){
            // System.out.print(" ");
            // }
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int l = 4; l > i; l--) {
                System.out.print(" ");
            }
            // System.out.print("*");
            if (i != 5) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // System.out.println(" *");
}
