import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class PartA {
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        int lowest = Integer.MAX_VALUE;
        ArrayList<Integer> values = new ArrayList<>();

        while(in.hasNext()) {
            int currentTemp = in.nextInt();
            values.add(currentTemp);
            if (currentTemp < lowest) {
                lowest = currentTemp;
            }
        }

        for(int i = 0; i < values.size(); i++) {
            System.out.printf("%5d", values.get(i));
            if(values.get(i) == lowest) {
                System.out.print(" <---- lowest");
            }
            System.out.println();
        }

        in.close();
    }
}
