import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        
        System.out.print("Please enter your name:");
        String name = in.nextLine();
        System.out.println("Your name is: " + name);
        
        System.out.println("Please enter your age:");
        int age = in.nextInt();
        System.out.println("Your age is: " + age);
        

    }
}