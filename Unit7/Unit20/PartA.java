import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("customer.txt"); 
        Scanner in = new Scanner(inputFile).useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.printf("%6s | %14s | %12s\n", "ID", "Name", "Balance");
        System.out.println("---------------------------------------");

        while (in.hasNext()) {
            String id = in.next();
            String name = in.next();
            double balance = Double.parseDouble(in.next());

            String formattedbalance = String.format("$%,.2f", balance);

            System.out.printf("%06d | %14s | %s\n", Integer.parseInt(id), name, formattedbalance);
            }

            in.close();
        }
}