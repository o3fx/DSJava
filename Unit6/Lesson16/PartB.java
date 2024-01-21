import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        double average1 = average(10, 8, 10);
        System.out.println("Average 1: " + average1);

        double[] scores = {100, 90, 80, 100, 80};
        double average2 = average(scores);
        System.out.println("Average 2: " + average2);
    }
    // Method which finds average
    public static double average(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        return sum / values.length;
    }
}