/**
 * This class calculates the value of PI.
 * It examines when pi gets to 3.14159
 * Meet the beauty of Math!
 * @author--Zheng Wang
 */
public class CalculatingPIValue {
    public static void main(String[] args) {
        double denominator = 1;
        double pi = 4/denominator;
        int n = 0;

        while(!(pi < 3.14160 && pi > 3.14159)){
            denominator += 2;
            n++;
            pi += Math.pow(-1,n) * 4/denominator;
            System.out.println(n);
        }

        System.out.print("Now PI is " + pi);
        System.out.printf(" after %d terms after the first 4/1", n);

    }

}
