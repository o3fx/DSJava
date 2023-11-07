package Unit05.Unit06.Unit07;
import java.util.Scanner;
public class Cafe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.print("What day is it. Enter in number format (Monday = 1,etc): ");
        int day = input.nextInt();
        if (day == 1) {
            System.out.print("What is your age: ");
                int age = input.nextInt();
                if (age < 13) {
                    System.out.println("Discount is: 7.5%");
                } else if (age >= 50) {
                    System.out.println("Discount is: 15%");
                } else {
                    System.out.println("Discount is 5%");
                }
        } else {
            System.out.print("What is your age: ");
                int age = input.nextInt();
                if (age < 13) {
                    System.out.println("Discount is: 5%");
                } else if (age >= 50) {
                    System.out.println("Discount is: 7.5%");
                } else {
                    System.out.println("Sorry, no discount available");
                }

        }

        


    }
}
