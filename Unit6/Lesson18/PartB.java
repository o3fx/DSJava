import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> testScores = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        int numberScores = 0;
        double totalScore = 0;

        while (true) {
            System.out.print("Enter quiz scores or type 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else {
                double score = input.nextDouble();
                testScores.add(score);
                totalScore += score;
                numberScores++;
            }
        }

        System.out.println("Test scores that you entered:");
        for (Double score : testScores) {
            System.out.printf("%.2f%n", score);
        }

        if (numberScores > 0) {
            double averagescore = totalScore / numberScores;
            System.out.printf("Average score: %.2f%n", averagescore);
        } else if (numberScores == 0){
            System.out.println("No scores entered.");
        }
    }
}