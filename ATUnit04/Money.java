import java.util.Scanner;
public class Money {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        int dollars;
        int cents;
        System.out.print("How much money do you have in dollars and cents xx.xx format: ");
        double mInput = in.nextDouble();
        dollars = (int) mInput;
        double temporary = (mInput - dollars)*100;
        cents = (int)Math.round(temporary);



        System.out.println("The dollars are: " + dollars);
        System.out.println("The cents are: " + cents);
        
    }
}
