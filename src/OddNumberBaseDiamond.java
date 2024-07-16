import java.util.Scanner;

/**
 * this class takes user input (odd numbers from 3 to 19)
 * prints odd number based asterisk diamond
 * @author--Zheng Wang
 */
public class OddNumberBaseDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = in.nextInt();

        while (base % 2 == 0 || base < 3 || base > 19) {
            System.out.println("Please enter an odd number between 3 and 19");
            base = in.nextInt();
        }

        for (int i = 1; i <= base; i++) {
            for (int j = base -1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = base -1; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= base - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = base - 1; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = base - 1; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
