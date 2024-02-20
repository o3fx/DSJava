import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Block3Ex1 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("missing.txt"
            );
            Scanner in = new Scanner(inputFile);
            while (in.hasNextLine()){
                String word = in.next();
                System.out.println(word);
            }
            in.close();
            System.out.println("Good bye!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}