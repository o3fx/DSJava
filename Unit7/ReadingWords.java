import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadingWords {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temp.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter(",");
        String placeH;
        String lowest;
        while (in.hasNext()) {
            String word = in.next();
            System.out.println(word);
            placeH = word;
            if (placeH < lowest) {
                
            }
        }
        in.close();
    }
}
