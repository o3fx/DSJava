import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Obesity {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("Top5Obesity.txt");
        Scanner in = new Scanner(inputFile);
        
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);

            lineScanner.useDelimiter("[,\\n]+");

            String name = lineScanner.next();
            name = name.trim();

            String nextWord = lineScanner.next();
            nextWord = nextWord.trim();
            double percentage = Double.valueOf(nextWord);

            nextWord = lineScanner.next();
            nextWord = nextWord.trim();
            int rank = Integer.valueOf(nextWord);

            String region = lineScanner.next();
            region = region.trim();

            System.out.printf("%-20s: (%02d) %6.2f%% | %-24s%n", name, rank, percentage, region);
        }
    }   
}
