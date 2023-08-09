
/*

1         
2 1       
3 2 1     
4 3 2 1   
5 4 3 2 1 
  
 */
public class Num_Pattern_04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i - j + " ");
            }
            // System.out.print(" ");
            System.out.println();
        }
        /*
         * for(int k=i;k>=1;k--){
         * System.out.print(k+" ");
         * }
         * System.out.println();
         */
    }
}
