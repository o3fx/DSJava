import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class PartB {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Double> scores = new ArrayList<>();
        double total = 0;
        int count = 0;

        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        PrintWriter out = new PrintWriter("output.txt");

        while(in.hasNextDouble()){
            double score = in.nextDouble();
            scores.add(score);
            total = total + score;
            count++;
        }

        for (int i = 0; i < count; i++) {
            out.printf("Quiz %03d: %.2f", i, scores.get(i));
            out.println();
        }
        double average = total / count;

        out.println("----------------");
        out.printf("Average:   %6.2f", average);

        in.close();
        out.close();
    }
}
