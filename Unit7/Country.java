import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("population.txt");
        Scanner in = new Scanner(inputFile);
        
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int i = 0;
            while(Character.isDigit(line.charAt(i)) == false){
                i++;
            }

            String name = line.substring(0,i);
            name = name.trim();

            String nextWord = line.substring(i);
            nextWord = nextWord.trim();
            double population = Double.valueOf(nextWord);

            System.out.println(name + " : " + population);
        }
    }   
}
