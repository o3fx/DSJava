package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12;
import java.util.Scanner;

public class E {
    public static double smallest(double num1, double num2, double num3) {
        if(num1 <= num2 && num1 <= num3){
            return num1;
        } else if(num2 <= num1 && num2 <= num3){
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please input one number: ");
        double num1 = input.nextInt();
        System.out.print("Please input a second number: ");
        double num2 = input.nextInt();
        System.out.print("Please input a third number: ");
        double num3 = input.nextInt();
        double smallestNum = smallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallestNum);
        
    }
}
    


