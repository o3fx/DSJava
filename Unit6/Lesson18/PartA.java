import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a name, or # to quit: ");
        ArrayList<String> names = new ArrayList<String>();
        while (true) {
            if (input.hasNext("#")) {
                break;
            } else {
                String name = input.next();
                names.add(name);
            }
        }
        System.out.println("Your names: ");
        for (String name : names) {
            System.out.println(name);

        }
    }
}
