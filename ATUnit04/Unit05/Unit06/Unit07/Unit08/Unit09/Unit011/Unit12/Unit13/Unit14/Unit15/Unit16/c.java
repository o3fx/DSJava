package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12.Unit13.Unit14.Unit15.Unit16;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] quiz = new double[100];
        System.out.print("Enter integer values or 'q' to quit: ");
        int currentSize = 0;
        while (true) {
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering input.");
                System.out.println("Amount of inputs:  " + currentSize);
                input.next();
                break;
            } else {
                if (currentSize < quiz.length) {
                    quiz[currentSize] = input.nextInt();
                    currentSize = currentSize + 1;
                } else {
                    System.out.println("Array is full!");
                    break;
                }
            }
    }
    System.out.println("Do you want to drop the lowest score? ")
}
}
