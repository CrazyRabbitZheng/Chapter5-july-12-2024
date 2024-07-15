import java.util.Scanner;

/**
 * This class calculates students' grade in letters
 * and counts the average and numbers of students who get A,B,C,D and F
 * end of file indicator in IntelliJ is Ctrl + d
 */
public class LetterGradesCalculator {
    public static void main(String[] args) {
        int total = 0;
        int aGrade = 0;
        int bGrade = 0;
        int cGrade = 0;
        int dGrade = 0;
        int fGrade = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter student grade(integer between 1 to 100) Type the end of file indicator(Ctrl + d) to stop entry ");

        while(input.hasNext()){
            System.out.print("Enter student grade: ");
            int grade = input.nextInt();
            total += grade;

            switch(grade / 10){
                case 10:
                case 9:
                    aGrade++;
                    break;
                case 8:
                    bGrade++;
                    break;
                case 7:
                    cGrade++;
                    break;
                case 6:
                    dGrade++;
                    break;
                default:
                    fGrade++;
                    break;

            }
        }

        if(total != 0){
            System.out.printf("%nClasss average is %.2f%n", (double)total/(aGrade+bGrade+cGrade+dGrade+fGrade));
            System.out.printf("%n%d Students got 'A'", aGrade);
            System.out.printf("%n%d Students got 'B'", bGrade);
            System.out.printf("%n%d Students got 'C'", cGrade);
            System.out.printf("%n%d Students got 'D'", dGrade);
            System.out.printf("%n%d Students got 'F'", fGrade);
        }
    }
}
