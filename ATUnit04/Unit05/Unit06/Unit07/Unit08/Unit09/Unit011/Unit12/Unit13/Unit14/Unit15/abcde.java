package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12.Unit13.Unit14.Unit15;

import java.util.Arrays;

public class abcde {
    public static void main(String[] args) {
        final int SIZE = 10;
        double place = 0;
        int[] numbers = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            place = Math.random();
            place = place * 10.0;
            place = place + 1;
            numbers[i] = (int)place;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
