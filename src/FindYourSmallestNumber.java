import java.util.Scanner;

/**
 * This class takes in n numbers from you and give you the smallest
 * @author--Zheng Wang
 */
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
