package Unit05.Unit06.Unit07;
import java.util.Scanner;
public class Cafe2 {
    public enum DayOfWeek {Monday, Tuesday, Wedensday, Thursday, Friday, Saturday, Sunday}
    public enum Age {Child, Adult, Senior}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.print("What day is it. Enter in number format (Monday = 1,etc): ");
        int day = input.nextInt();
        System.out.print("What is your age: ");
        int year = input.nextInt();
        // What does this mean?
        DayOfWeek today;
        if (day == 0) {
            today = DayOfWeek.Sunday;
        } else if (day == 1) {
            today = DayOfWeek.Monday;
        } else if (day == 2) {
            today = DayOfWeek.Tuesday;
        } else if (day == 3) {
            today = DayOfWeek.Wedensday;
        } else if (day == 4) {
            today = DayOfWeek.Thursday;
        } else if (day == 5) {
            today = DayOfWeek.Friday;
        } else {
            today = DayOfWeek.Saturday;
        }
        Age numberAge;
        if (year < 13) {
            numberAge = Age.Child;
        } else if (year >= 50) {
            numberAge =  Age.Adult;
        } else {
            numberAge = Age.Senior;
        }

        if (today == DayOfWeek.Monday) {
                if (numberAge == Age.Child) {
                    System.out.println("Discount is: 7.5%");
                    System.out.println("Customer is a child");
                } else if (numberAge == Age.Adult) {
                    System.out.println("Discount is: 15%");
                    System.out.println("Customer is a senior");
                } else if (numberAge == Age.Senior){
                    System.out.println("Discount is 5%");
                    System.out.println("Customer is a adult");
                }
        } else {
                if (numberAge == Age.Child) {
                    System.out.println("Discount is: 5%");
                    System.out.println("Customer is a child");
                    } else if (numberAge == Age.Adult) {
                    System.out.println("Discount is: 7.5%");
                    System.out.println("Customer is a senior");
                } else if (numberAge == Age.Senior){
                    System.out.println("Sorry, no discount available");
                    System.out.println("Customer is a adult");
                }

        }

        


    }
}
