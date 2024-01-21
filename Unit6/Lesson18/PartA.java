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
                System.out.println(names);
            }
        }
        //for(int i = 0; i < names.length)
        /*names.add("Emily");
        names.add("Bob");
        names.add("Cindy");
        */
        System.out.println(names);
        //String name1 = names.get(i);
        //for (String name:names) {
        //}
}
}
