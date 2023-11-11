package Unit05.Unit06.Unit07.Unit08;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in); 
        System.out.print("What is your interest rate (In decimal form, .06 meaning 6%)): ");
        double rate = input.nextDouble();
        System.out.print("What is your inital balance: ");
        double intBalance = input.nextDouble();
        int years = 1;
        double amount = 0;
        System.out.println("Year |        Int Earned ($)       |           Balance ($)");
        System.out.println("-----------------------------------------------------------");
        for (years = 0; years < 5; years++)
        {
            amount = intBalance * rate;
            intBalance = intBalance + amount;
            System.out.printf("%4d|        %22.2f|      %14.2f%n" , years, amount, intBalance);
        }

    }
    
    
}
