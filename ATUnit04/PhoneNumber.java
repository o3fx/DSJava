import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args){
    Scanner stringScanner = new Scanner(System.in);
    System.out.print("Enter a 10 digit phone number (no spaces): " );
    String phoneNumber = stringScanner.next();
    
    if (phoneNumber.length() == 10) {
    // I got the string inspiration from online, as previously I was using integers and trying to format it, but it didn't seem to work
    String phoneNumber1 =  "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
    System.out.println("Phone number is: " + phoneNumber1);
    } else {
        System.out.println("Phone number is invalid");
    }

    }
}
