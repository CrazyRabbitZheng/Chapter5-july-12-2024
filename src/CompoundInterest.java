/**
 * This class calculates the final amount of money after nth years of saving, up to 7 years
 * Calculates the final money with a rate range from 5% to 10% (0.05, 0.06,...,0.10)
 * @author--Zheng Wang
 */
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;

        for (int rateCounter = 5; rateCounter <= 10; rateCounter++) {
            for (int yearCounter = 1; yearCounter <= 7; yearCounter++) {
                double saving = principal * Math.pow(1 + (double)rateCounter/100, yearCounter);//if dont cast double, results in integer division,
                //integer division gets 1. i to the nth power is still 1. After many years' saving, your money stays the same!
                System.out.printf("%nWith a rate of %d%%, the %d th year's saving is %.2f", rateCounter, yearCounter, saving);
            }
            System.out.println();
            System.out.println();
        }
    }
}
