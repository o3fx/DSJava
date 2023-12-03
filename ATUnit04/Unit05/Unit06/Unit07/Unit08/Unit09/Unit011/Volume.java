package Unit05.Unit06.Unit07.Unit08.Unit09.Unit011;

import java.util.Scanner;

public class Volume {
    public static double vol(double r) {
        double answer = (4.0 / 3.0) * 3.14 * (r * r * r);
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("What is the radius: ");
        double r = input.nextDouble();
        double vol = vol(r);
        System.out.println(vol);
    }

}
