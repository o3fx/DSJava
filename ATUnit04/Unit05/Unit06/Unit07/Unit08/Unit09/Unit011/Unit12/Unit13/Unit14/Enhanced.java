package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12.Unit13.Unit14;

public class Enhanced {
    public static void main(String[] args) {
        double total = 0;
        double[] numbers = {8, 6, 7, 5, 3, 0, 9};
        for (double element : numbers) {
            total = total + element;
            System.out.println(element);
        }
            
        double average = total / numbers.length;
        System.out.printf("Your average = %.2f %n", average);
    }
}
