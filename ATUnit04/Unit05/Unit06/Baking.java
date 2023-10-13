package Unit05.Unit06;
import java.util.Scanner;
    public class Baking{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in); 
            System.out.print("How many pies do you want to buy: ");
            int pies = in.nextInt();

            if (pies >= 3){
                double piePrice = (pies * 10) * .9;
                System.out.println("The total cost will be: $" + piePrice);
            }
            else if (pies < 3){
                double piePrice = (pies * 10);
                System.out.println("The total cost will be: $" + piePrice);
            }


        }
    }