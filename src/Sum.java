/**
 * This class sums even numbers from 2 to 20
 * using for loop
 * @author--Zheng Wang
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 20; i += 2) {
            sum += i;
        }
        System.out.printf("The sum of all even numbers from 2 to 20 is: %d", sum);
    }
}