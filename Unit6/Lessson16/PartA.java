import java.util.Scanner;


public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[10];
        System.out.print("Enter a test score or 'q' to quit: ");
        int currentSize = 0;
        while (true) {
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering scores.");
                System.out.println("Amount of scores:  " + currentSize);
                input.next();
                break;
            } else {
                if (currentSize < scores.length) {
                    scores[currentSize] = input.nextInt();
                    currentSize = currentSize + 1;
                } else {
                    System.out.println("Array is full!");
                    break;
                }
            }

        }
        

        double lowest = scores[0];
        System.out.print("Values entered: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(scores[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }


        System.out.println();
        System.out.printf("lowest value is %.2f%n", lowest);


        System.out.println("Would you like to drop your lowest score? If so, type 'y'. ");
        if (input.hasNext("y") || input.hasNext("Y")) {
            currentSize = dropLowestScore(scores, currentSize, lowest);
            System.out.print("Quiz Scores after dropping the lowest score: ");
            for (int i = 0; i < currentSize; i++) {
                System.out.print(scores[i]);
                if (i < currentSize - 1) {
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