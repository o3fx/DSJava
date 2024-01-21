import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        double total1 = average(10, 8, 10);
        System.out.println("Average 1: " + total1);

        double total2 = average(100, 90, 80, 100, 80);
        System.out.println("Average 2: " + total2);
    }

    public static double average(double... values) {
        double sum = 0;
        for (double value : values) {
            sum = sum + value;
        }

        return sum / values.length;
    }
}