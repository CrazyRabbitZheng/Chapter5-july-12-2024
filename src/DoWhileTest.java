/**
 * This class print numbers 1 to 10 using do...while loop
 * @author--Zheng Wang
 */
public class DoWhileTest {
    public static void main(String[] args) {

        int counter = 1;
        do{
            System.out.printf("%d\t",counter);
            counter++;
        }while(counter <= 10);
    }
}
