/**
 * This class prints 1 to 10, skip 5
 * @author--Zheng Wang
 */
public class Skip5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
