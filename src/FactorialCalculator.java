/**
 * This class calculates factorial from 1 to 20
 * numbers can be big. Use long type.
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            long factorial = 1;

            for(int j = 1; j <= i; j++){
                factorial *= j;
            }

            System.out.printf("The factorial of %d is %d\n", i, factorial);
        }
    }
}
