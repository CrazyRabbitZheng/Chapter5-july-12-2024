/**
 * This class uses sheer(纯粹的)brute-force computing to list all Pythagorean triples below 500.
 * <pre>
 * Short side A        Short side B        Hypotenuse
 *
 * 3                   4                   5
 * 4                   3                   5
 * 5                   12                  13
 * .                   .                   .
 * 480                 108                 492
 * 480                 140                 500
 * 483                 44                  485
 * </pre>
 */
public class PythagoreanTripleTable {
    public static void main(String[] args) {

        System.out.printf("%-20s%-20s%-20s%n%n","Short side A","Short side B","Hypotenuse");

        for (int shortSideA = 1; shortSideA <= 500; shortSideA++) {
            for (int shortSideB = 1; shortSideB <= 500; shortSideB++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if(hypotenuse * hypotenuse == shortSideA * shortSideA + shortSideB * shortSideB){
                        System.out.printf("%-20d%-20d%-20d%n",shortSideA,shortSideB,hypotenuse);
                    }
                }
            }
        }

    }
}
