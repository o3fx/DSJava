import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("sales.txt");
        Scanner scanner = new Scanner(file).useDelimiter("[,\\s\\n]+");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line).useDelimiter("[,\\n\\s ]+");
            String category = lineScanner.next();
            String name = lineScanner.next();
            double sales;
            if (lineScanner.hasNextDouble()) {
                sales = lineScanner.nextDouble();
            } else {
                sales = 0.0;
            }
            System.out.printf("%-17s | %-10s | $%10.2f%n", category, name, sales);
       }

   }
}
