import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); 
        double pi = Math.PI;
        System.out.println("Pi: " + pi);

        // Depends on the number in the (), a method
        System.out.println("Enter a number you want squared: ");
        double x = in.nextDouble();
        double squaredValue = Math.pow(x, 2);
        System.out.println("Your number squared is: " + squaredValue);

        System.out.println("Your number squared + pi is " + (pi + squaredValue));
    }
}