import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temperatures = new ArrayList<Integer>();
        int lowesttemp = 0;

        while (true) {
            System.out.print("Enter a temperature or type 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;
            } else {
                int temp = input.nextInt();
                temperatures.add(temp);
                int size = temperatures.size();
                if (size == 1) {
                    lowesttemp = temperatures.get(0);
                } else if (temperatures.get(size - 1) < lowesttemp ) {
                lowesttemp = temperatures.get(size - 1);
                }
            
            }
        }

        System.out.println("Temperatures that you entered:");
        for (Integer temp : temperatures) {
            System.out.print(temp);
            if (temp == lowesttemp) {
                System.out.print(" <= lowest temperature");
            }

            System.out.println();
        }

        System.out.println("Lowest Temperature: " + lowesttemp);
    }
}