/**
 * This class takes in user input of products and print the final sales
 * This code has flaw. didn't have data validation.
 * when type in "quit" in productName, didn't quit immediately. waited to enter the quantity to quit.
 */
import java.util.Scanner;

public class FindYourSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to enter: ");
        int counter = sc.nextInt();
        int smallestNumber = 0;

        if (counter > 0 ) {
            for (int i = 1; i <= counter; i++) {
                System.out.println("Enter the number you want to compare: ");
                int number = sc.nextInt();
                if(number < smallestNumber) {//intelliJ auto completion added the {} before the statements, so that the if condition never executes
                    smallestNumber = number;//With the logical error above, this statement always executes.The smallest number became the last number entered.
                }
            }

            System.out.printf("The smallest number is %d", smallestNumber);
        }else {
            System.out.println("You did not enter numbers to compare.");
        }
    }
}
