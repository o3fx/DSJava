import java.util.Arrays;
import java.util.Scanner;

public class PartC {
    public static int linearSearch(int[] array, int tgtVal) {
        int size2 = array.length;
        for (int c = 0; c < size2; c++) {
            if (array[c] == tgtVal) {
                return c;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long start = 0;
        long stop = 0;
        long e = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value: (1-10): ");
        int value = input.nextInt();
        final int SIZE = 10000000;
        double place = 0;
        int[] numbers = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            place = Math.random();
            place = place * SIZE;
            place = place + 1;
            numbers[i] = (int) place;
        }
        //System.out.println(Arrays.toString(numbers));
        start = System.currentTimeMillis();
        int ret = linearSearch(numbers, value);
        stop = System.currentTimeMillis();
        e = stop - start;
        if (ret < 0) {
            System.out.println("Value not found");
            System.out.println("Elapsed time is: " + e);
        } else {
            System.out.println("The value was found index = " + ret);
            System.out.println("Elapsed time is: " + e);
        }
        int[] numbersSorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbersSorted);
        start = System.currentTimeMillis();
        ret =  Arrays.binarySearch(numbersSorted, value);
        stop = System.currentTimeMillis();
        e = stop - start;
        if (ret < 0) {
            System.out.println("Value not found");
            System.out.println("Elapsed time is: " + e);
        } else {
            System.out.println("The value was found index = " + ret);
            System.out.println("Elapsed time is: " + e);
        }
    }
}