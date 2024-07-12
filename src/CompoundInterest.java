/**
 * This class calculates the final amount of money after nth year of saving
 * @author--Zheng Wang
 */
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s","Year","Amount on deposit");

        for (int i = 1; i <= 10; i++) {
            //add , when dealing with money
            System.out.printf("%n%4d%,20.2f%n",i, principal * Math.pow((1 + rate), i));
        }

    }
}
