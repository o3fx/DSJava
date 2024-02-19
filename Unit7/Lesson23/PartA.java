
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            int quizScore = getQuizScore(input);
            System.out.println("Quiz score entered: " + quizScore);
        } catch (ArithmeticException d) {
            System.out.println("Error, enter a score between 0-100");
        }
    }

    public static int getQuizScore(Scanner in) {
        System.out.print("Enter quiz score (0-100): ");
        int score = in.nextInt();
        return score;
    }
}
