import java.util.Scanner;

public class Zipcode {
    public static String getBarCode(String zipCode) {
        // We are declaring a variable called barcode, that starts it off a leading bar
        // "|"
        String barcode = "|";
        // We are declaring a charecter called c, that will hold each digit of zipcode
        char c;
        // We are looping through each individual charecter
        for (int i = 0; i < zipCode.length(); i++) {
            c = zipCode.charAt(i);
            barcode = barcode + getEncodedDigit(c);
        }
        //Calculate checksum
        int checkSum = getCheckDigit(zipCode);
        barcode = barcode + getEncodedDigit((char) (checkSum + '0')); // Converting int to char
        // We are adding a trailing barcode
        barcode = barcode + "|";
        return barcode;
    }

    public static String getEncodedDigit(char c) {
        String encodedDigit = "";
        if (c == '1') {
            encodedDigit = ":::||";
        } else if (c == '2') {
            encodedDigit = "::|:|";
        } else if (c == '3') {
            encodedDigit = "::||:";
        } else if (c == '4') {
            encodedDigit = ":|::|";
        } else if (c == '5') {
            encodedDigit = ":|:|:";
        } else if (c == '6') {
            encodedDigit = ":||::";
        } else if (c == '7') {
            encodedDigit = "|:::|";
        } else if (c == '8') {
            encodedDigit = "|::|:";
        } else if (c == '9') {
            encodedDigit = "|:|::";
        } else if (c == '0') {
            encodedDigit = "||:::";
        }
        return encodedDigit;
    }

    public static int getCheckDigit(String zipCode) {
        int total = 0;
        for (int i = 0; i < zipCode.length(); i++) {
            int num = zipCode.charAt(i) - '0'; // Convert char to int
            total = total + num;
        }
        int result = total % 10;
        if (result == 0) {
            return 0;
        } else {
            return 10 - result;
        }
    }

    public static void main(String[] args) {
        // get the zipcode from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your zipcode: ");
        String zipcode = input.nextLine();

        // We are converting the zipcode into barcode
        String barcode = getBarCode(zipcode);

        // We are then printing out the barcode
        System.out.println("The barcode is: " + barcode);

    }
}