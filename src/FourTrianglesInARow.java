/**
 * This class combines four asterisks triangles
 * display all 4 triangles in a row
 * Add triangles one by one
 * two phase -- first use @ instead of space to see directly,second change all @ to " "
 * from
 * <pre>
 * *@@@@@@@@@**********@@*********@@@@@@@@@@*
 * **@@@@@@@@*********@@@@********@@@@@@@@@**
 * ***@@@@@@@********@@@@@@*******@@@@@@@@***
 * ****@@@@@@*******@@@@@@@@******@@@@@@@****
 * *****@@@@@******@@@@@@@@@@*****@@@@@@*****
 * ******@@@@*****@@@@@@@@@@@@****@@@@@******
 * *******@@@****@@@@@@@@@@@@@@***@@@@*******
 * ********@@***@@@@@@@@@@@@@@@@**@@@********
 * *********@**@@@@@@@@@@@@@@@@@@*@@*********
 * ***********@@@@@@@@@@@@@@@@@@@@@**********
 * </pre>
 * to
 * <pre>
 * *         **********  *********          *
 * **        *********    ********         **
 * ***       ********      *******        ***
 * ****      *******        ******       ****
 * *****     ******          *****      *****
 * ******    *****            ****     ******
 * *******   ****              ***    *******
 * ********  ***                **   ********
 * ********* **                  *  *********
 * ***********                     **********
 * </pre>
 * @author--Zheng Wang
 */
public class FourTrianglesInARow {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {//this is * triangle #
                System.out.print("*");
            }

            for (int j = 9; j >= i; j--) {//this is @(later will be space)triangle #1
                System.out.print(" ");
            }

            for (int j = 10; j >= i; j--) {//This is * triangle #2
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {//This is @ triangle #2
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {//this is previous * triangle #1,then changed * to @. Now is @ triangle #3
                System.out.print(" ");
            }
            for (int j = 9; j >= i; j--) {//this is previous @ triangle #1,then changed @ to *.Now is * triangle #3
                System.out.print("*");
            }
            for (int j = 10; j >= i; j--) {//This is previous * triangle #2.Then changed * to @.Now is @ triangle #4
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {//This is previous @ triangle #2.Changed @ to *.Now is * triangle #4
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
