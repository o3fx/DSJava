import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter integer values (use 'q' to quit): ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering input.");
                input.next();
                break;
            } else { 
                numbers.add(input.nextInt());
            }
        }

        int j = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                j = j + numbers.get(i);
            } else {
                j = j - numbers.get(i);
            }
            }
            System.out.println("The answer is = " + j);

    }
}