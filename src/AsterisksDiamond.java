/**
 * This class prints a diamond with asterisks
 * first print 4 litter triangles on the top
 * use @ instead of space for visibility.
 * <pre>
 * @@@@*@@@@
 * @@@***@@@
 * @@*****@@
 * @*******@
 * *********
 * </pre>
 * Then the bottom
 * <pre>
 * @@@@@@@@*
 * *@@@@@@**
 * **@@@@***
 * ***@@****
 * *********
 * </pre>
 * last flip the bottom's * and @,and change @ to " "
 * There are subtle changes, because upper and bottom triangles have different base. one is 5, the other is 4.
 * <pre>
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * </pre>
 * @author--Zheng Wang
 */
public class AsterisksDiamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        //above is the upper part;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
