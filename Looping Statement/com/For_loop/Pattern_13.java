public class Pattern_13 {
    public static void main(String[] args) {
        /*
        
*
 *
  *
   *
    *
   *
  *
 *
*
        
        */
        // for(int i1=1;i1<=9;i1++){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        /////////////////////////////////////////////////////////
        /*
         
             *
           *
          *
         *
        *
         *
          *
           *
            *
        
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        // }
    }
}
