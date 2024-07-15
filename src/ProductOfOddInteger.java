/**
 * This class calculates the product of the odd integer from 1 to 15
 */
public class ProductOfOddInteger {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        System.out.printf("%nThe product of the odd numbers from 1 to 15 is %d.", product);
    }
}
