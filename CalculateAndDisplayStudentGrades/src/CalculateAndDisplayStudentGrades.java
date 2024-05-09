import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculateAndDisplayStudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = null;
        String testScores;
        char grade;
        int total = 0;

        System.out.println("Please enter 'quit' to stop or type anything else to enter another student's test scores : ");
        String command = input.nextLine();
        while (!Objects.equals(command, "quit")) {

            System.out.println("Please enter the student's name : ");
            name = input.nextLine();
            System.out.println("Please enter " + name + "'s 5 test scores separated by a space : ");
            testScores = input.nextLine();
            StringTokenizer myTokens = new StringTokenizer(testScores);
            while (myTokens.hasMoreTokens()) {
                String nextScore = myTokens.nextToken();
                int scoreInt = Integer.parseInt(nextScore);
                total += scoreInt;
            }

            int average = total / 5;

            if (average >= 80) {
                grade = 'A';
            } else if (average >= 70 && average < 80) {
                grade = 'B';
            } else if (average >= 60 && average < 70) {
                grade = 'C';
            } else if (average >= 50 && average < 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            switch (grade) {
                case 'A':
                    System.out.println(name + "'s average is " + average + " resulting in a grade of " + grade);
                    break;
                case 'B':
                    System.out.println(name + "'s average is " + average + " resulting in a grade of " + grade);
                    break;
                case 'C':
                    System.out.println(name + "'s average is " + average + " resulting in a grade of " + grade);
                    break;
                case 'D':
                    System.out.println(name + "'s average is " + average + " resulting in a grade of " + grade);
                    break;
                default:
                    System.out.println(name + "'s average is " + average + " resulting in a grade of " + grade);
            }
        }
    }
}
