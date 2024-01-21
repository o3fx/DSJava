import java.util.Random;

public class PartA {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        double place = 0;
        for (int i = 0; i < 10; i++) {
            place = Math.random();
            place = place * 10;
            place = place + 1;
            numbers[i] = (int) place;
        }

        System.err.println("Numbers at even index"); 
        for(int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        System.out.println("Even elements:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();

        System.out.println("Elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        // Print first and last
        System.out.println("First and last element:");
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[numbers.length - 1]);
        System.out.println();

    }
}