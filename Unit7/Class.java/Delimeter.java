import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Delimeter {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("money.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[;\\n]+");
            String name = lineScanner.next().trim();
            String nextWord = lineScanner.next().trim();
            nextWord = nextWord.replaceAll(",", "");
            nextWord = nextWord.replaceAll("\\$", "");
            double money = Double.valueOf(nextWord);
            double tax = money * .03;
            String region = lineScanner.next().trim();
            System.out.printf("%-20s: $ %,14.2f%% | $ %,14.2f%% | %-24s%n", name , money, tax, region);
        }
        
 
    }
}
