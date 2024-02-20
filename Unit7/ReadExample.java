import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("scores.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("scores.Formatted.txt");
        PrintWriter out = new PrintWriter(outputFile);

        while (in.hasNext()) {
            double score = in.nextDouble();
            System.out.printf("%6.2f%n",score);
        }

        in.close();
        out.close();
    }
}
