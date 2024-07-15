import java.util.Scanner;

/**
 * This class takes 5 number inputs from user. (1 to 30)
 * it prints that many *'s as bar for each number
 */
public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Please enter %dth number between 1 to 30: ",i);
            int value = in.nextInt();

            while (value < 1 || value > 30) {
                System.out.printf("Please enter %dth number again, must between 1 to 30: ",i);
                value = in.nextInt();
            }

            for (int j = 1; j <= value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
