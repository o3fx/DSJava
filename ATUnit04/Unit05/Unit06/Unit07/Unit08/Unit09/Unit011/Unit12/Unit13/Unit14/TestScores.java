package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12.Unit13.Unit14;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        final int SIZE = 20;
        Scanner input = new Scanner(System.in);
        double[] values = new double[SIZE];
        int numberOfScores = 0;
        boolean doLoop = true;
        while(doLoop) {
            System.err.print("Enter a score, or q to quit: "); 
            if (input.hasNext("q") || input.hasNext("Q")) {
            doLoop = false;
        } else {
            if (numberOfScores < values.length){
            values[numberOfScores] = input.nextDouble();
            numberOfScores = numberOfScores + 1;
            } else {
                System.out.println("There's no more space. Can't input more scores");
                doLoop = false;
            }
        }

    }

    double total = 0;
    for (int i = 0; i < numberOfScores; i++) {
        total = total + values[i];
        System.out.printf("Test # %3d: %.2f %n", i + 1, values[i]);
    }
    System.out.printf("Average score = %.2f %n", total / numberOfScores);
}
}
