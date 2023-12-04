package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011.Unit12;
import java.util.Scanner;


public class countVowels {
    public static boolean isVowel(char c){
        if (c == 'a' || c == 'A') {
            return true;
        } else if (c == 'e' || c == 'E') {
            return true;
        } else if (c == 'i' || c == 'I') {
            return true;
        } else if (c == 'o' || c == 'O') {
            return true;
        } else if (c == 'u' || c == 'U') {
            return true;
        } else {
            return false;
        }
    } 
    // The method countVowels() returns the number of  vowels in theString called phrase.
    public static int countVowels(String phrase){
        int numVowels = 0;
        char c;
        for(int i = 0; i < phrase.length(); i++) { 
            c = phrase.charAt(i);
            if (isVowel(c)) {
                numVowels = numVowels + 1;
            }
        }
        return numVowels;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
        int number = countVowels(phrase);
        System.out.println("The amount of vowels is: " + number);
    }
}
