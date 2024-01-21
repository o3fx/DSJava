import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array and fill it
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Enter integer values (use 'q' to quit):");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else { 
                numbers.add(input.nextInt());
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                sum += numbers.get(i);
            } else {
                sum -= numbers.get(i);
            }
            }
            System.out.println("Sum = " + sum);

    }
}