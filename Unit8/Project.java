import java.util.Scanner;
import mow.Yard;

public class Project {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height and width of the yard: ");
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        Yard yard = new Yard(height, width);
        yard.printYard(); 

        scanner.close();
    }
}