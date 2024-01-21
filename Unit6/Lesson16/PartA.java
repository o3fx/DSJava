import java.util.Scanner;


public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[100]; 
        int count = 0;

        // Get inputs
        while (true) {
            System.out.print("Enter quiz scores and type 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;    
            } else {
                scores[count] = input.nextInt();
                count++;
            }
        }
        
        // Find Lowest values
        double lowest = scores[0];
        System.out.print("Values entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(scores[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Display
        System.out.println();
        System.out.printf("lowest value is %.2f%n", lowest);

        // Start dropping lowest score
        System.out.println("Would you like to drop your lowest score? If so, type 'y'. ");
        if (input.hasNext("y") || input.hasNext("Y")) {
            input.next(); 
            count = dropLowestScore(scores, count, lowest);
            System.out.print("Quiz Scores after dropping the lowest score: ");
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i]);
                if (i < count - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    // Method to drop score
    private static int dropLowestScore(double[] scores, int count, double lowest) {
        // drop lowest score
        int index = -1;
        for(int i = 0; i < count; i++) {
            if (Math.abs(lowest - scores[i]) < 0.00000001) {
                index = i;
                break;
            }
        }

        if (index >=0) {
            for(int i = index + 1; i < count; i++) {
                scores[i - 1] = scores[i];
            }
        }
        count = count - 1;
        return count;
    }
}