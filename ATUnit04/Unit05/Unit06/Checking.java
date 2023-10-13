package Unit05.Unit06;

import java.util.Scanner;

public class Checking {
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();

    // are they lucky?
    if (age == 13) {
    System.out.println("Lucky 13!");

    } else {
        System.out.println("You aren't lucky sadly");
    }
}
}

