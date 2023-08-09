
/*
  
5 4 3 2 1 
1 2 3 4   
5 4 3     
1 2       
5 

 */

public class Num_Pattern_05 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 5; i = i + 2) {// 4
            for (int j = 5; j >= i; j--) {// j=4

                System.out.print(j + " ");
            }
            System.out.println();
            for (int k = 4; k >= i; k--) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
            count = 0;

        }
    }
}
