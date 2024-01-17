package Unit05.Unit06.Unit07.Unit08.Unit09;

import java.util.Scanner;

public class TestAVG {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
            double value;
            double value1 = 0;
            double avg = 1;
            do {
                System.out.print("Enter a test score in: ");
                value = input.nextDouble();
                if (value >= 0) {
                value1 = (value1 + value) / avg;
                avg = avg + 1;
                }
}
            while (value >= 0);
                System.out.println(value1);



    
}
}
