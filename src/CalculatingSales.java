/**
 * This class takes in user input of products and print the final sales
 * This code has flaw. didn't have data validation.
 * ！！！！！！！！！！！！when type in "quit" in productName, didn't quit immediately. waited to enter the quantity to quit.
 */
import java.util.Objects;
import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double productTotal = 0.0;
        String productName = "";
        int productQuantity = 0;

        while(!Objects.equals(productName, "quit")){
            System.out.println("Enter product name: ");
            productName = input.next();
            System.out.println("Enter product quantity: ");
            productQuantity = input.nextInt();

            switch(productName){
                case "onion":
                    productTotal += productQuantity * 8.80;
                    break;
                case "banana":
                    productTotal += productQuantity * 6.25;
                    break;
                case "diamond":
                    productTotal += productQuantity * 1100.20;
                    break;
                case "water":
                    productTotal += productQuantity * 3.50;
                    break;
                case "grape":
                    productTotal += productQuantity * 10.00;
                    break;
            }
        }
        System.out.println("Product total: " + productTotal);
    }
}
