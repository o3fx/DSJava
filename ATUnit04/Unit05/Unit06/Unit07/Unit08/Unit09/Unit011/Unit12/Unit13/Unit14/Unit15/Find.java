package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12.Unit13.Unit14.Unit15;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter integer values or 'q' to quit: ");
        int currentSize = 0;
        while (true) {
            if (input.hasNext("q") || input.hasNext("Q")) {
                System.out.println("Done entering input.");
                System.out.println("Amount of inputs:  " + currentSize);
                input.next();
                break;
            } else {
                if (currentSize < numbers.length) {
                    numbers[currentSize] = input.nextInt();
                    currentSize = currentSize + 1;
                } else {
                    System.out.println("Array is full!");
                    break;
                }
            }

        }
        for (int i = 0; i < currentSize; i++) {
            System.out.print(numbers[i]);
            if (i == currentSize - 1) {
                System.out.println("");
            } else {
                System.out.print(",");
            }
        }
        System.out.println("Enter a target value integer: ");
        int tgt = input.nextInt();
        int count = 0;
        for (int j = 0; j < currentSize; j++) {
            if (numbers[j] == tgt) {
                count = count + 1;
            }

        }
        System.out.print("The value " + tgt + " occurs " + count + " times in your original data set");
    }
}
