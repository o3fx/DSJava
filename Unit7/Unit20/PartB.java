import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("characters.txt");
        Scanner in = new Scanner(inputFile);

        int tChar = 0;
        int tLetter = 0;
        int tDigit = 0;

        while (in.hasNext()) {
            String line = in.nextLine();
            
            for (char c : line.toCharArray()) {
                    tChar++;
                    if (Character.isLetter(c)) {
                        tLetter = tLetter + 1;
                    }
                    else if (Character.isDigit(c)) {
                        tDigit = tDigit + 1;
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
            in.close();

        System.out.println("count = " + tChar);
        System.out.println("letters = " + tLetter);
        System.out.println("digits = " + tDigit);

    } 
}