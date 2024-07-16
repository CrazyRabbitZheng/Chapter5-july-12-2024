/**
 * This class prints some output for practice
 */
public class LittlePractice {
    public static void main(String[] args) {
        int i = 1;
        int j =2;
        int k = 3;
        int m = 2;
        System.out.println(i == 1);//what does this print?
        //above prints ---   true


        for (i =1; i<=5; i++){
            for (j =1; j<=3; j++){
                for (k =1; k<=4; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
        /**
         * code above prints
         * <pre>
         * ****
         * ****
         * ****
         *
         *(3 more groups here)
         *
         * ****
         * ****
         * ****
         * </pre>
         */
    }
}
