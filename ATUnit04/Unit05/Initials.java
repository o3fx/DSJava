package Unit05;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args){
        Scanner stringScanner = new Scanner(System.in);
        System.out.print("What is your First Name: ");
        String firstName = stringScanner.next();
        System.out.print("What is your Middle Name: ");
        String middleName = stringScanner.next();
        System.out.print("What is your Last Name: ");
        String lastName = stringScanner.next();

        String firstLetter1 = firstName.substring(0, 1);
        String firstLetter2 = middleName.substring(0, 1);
        String firstLetter3 = lastName.substring(0, 1);

        System.out.println("Monogram: " + firstLetter1 + firstLetter2 + firstLetter3);


    } 
}
