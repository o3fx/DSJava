import java.util.Scanner;
import mow.Yard;
import mow.Mower;

public class Project {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        clearScreen();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height of the yard: ");
        int height = in.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = in.nextInt();

        Yard yard = new Yard(height, width);

        yard.printYard();
        System.out.println();

        System.out.print("Enter a starting row in your yard: ");
        int mrow = in.nextInt();

        System.out.print("Enter a starting column in your yard: ");
        int mcolumn = in.nextInt();

        System.out.print("Enter a starting direction for your mower. 0 is up, 1 is right, 2 is down, 3 is left: ");
        int mdirection = in.nextInt();

        Mower mower = new Mower(mrow, mcolumn, mdirection);
        yard.printYard(mower);

        while (true) {
            mower.cutGrass(yard);
            if (mower.checkGrass(yard)) {
                mower.moveForward();
            } else {
                break;
            }
            Project.clearScreen();
            yard.printYard(mower);
            delay(300);
        }

        in.close();
    }
}
