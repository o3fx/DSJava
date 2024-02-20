import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

 public class PartA {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Specify a filename or '#' to quit: ");
            String filename = scanner.nextLine();
            
            if (filename.equals("#")) {
                System.out.println("Terminating");
                Thread.sleep(1000);
                System.out.println("beep");
                Thread.sleep(1000);
                System.out.println("boop");
                break;
            }
            
            try {
                File file = new File(filename);
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNext()) {
                    System.out.println(fileScanner.next());
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please try again.");
                    continue;
            }
        }
    }
}