/**
 * This class prints 4 triangles with *'s or other symbol
 * <p>
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 * ********
 * *********
 * **********
 *
 * **********
 *  *********
 *   ********
 *    *******
 *     ******
 *      *****
 *       ****
 *        ***
 *         **
 *          *
 *     </>
 * @author--Zheng Wang
 */
/*when you mess up with the values of i and j. list out the changing point of *'s
the coordinates for the only * in the first row is i=1, j=10
on the 5th row, the coordinates for the first * is i=5, j=6
so the first * in each row has the coordinates of i + j = 11
the *'s after the first * in each row have the coordinates i + j > 11
*/
public class Triangle {
    public static void main(String[] args) {
        System.out.println();

        for(int i = 1; i <= 10; i++){
            for(int j = 1;j <= 10; j++){
                if(j <= i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 10; i++){
            for(int j = 1;j <= 11 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 10; i++){
            for(int j = 1;j <= 10; j++){
                if(j >= i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 10; i++){
            for(int j = 1;j <= 10; j++){
                if(j + i < 11){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
