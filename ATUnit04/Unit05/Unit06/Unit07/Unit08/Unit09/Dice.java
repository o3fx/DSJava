package Unit05.Unit06.Unit07.Unit08.Unit09;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        double r = 0;
        r = Math.floor(Math.random() * (max - min + 1));
        System.out.println(r);

        if (r == 1) {
            System.out.println("+-------+");
            System.out.println("|       |"); 
            System.out.println("|   x   |"); 
            System.out.println("|       |"); 
            System.out.println("+-------+");
        } else if (r == 2) {
            System.out.println("+-------+");
            System.out.println("|  x     |"); 
            System.out.println("|        |"); 
            System.out.println("|     x  |"); 
            System.out.println("+-------+");  
            } else if (r == 3) {
            System.out.println("+-------+");
            System.out.println("|   x   |"); 
            System.out.println("|   x   |"); 
            System.out.println("|   x   |"); 
            System.out.println("+-------+");  
            } else if (r == 4) {
            System.out.println("+-------+");
            System.out.println("| x   x |"); 
            System.out.println("|       |"); 
            System.out.println("| x   x |"); 
            System.out.println("+-------+");  
            } else if (r == 5) {
            System.out.println("+-------+");
            System.out.println("| x   x |"); 
            System.out.println("|   x   |"); 
            System.out.println("| x   x |"); 
            System.out.println("+-------+");  
            } else if (r == 6) {
            System.out.println("+-------+");
            System.out.println("| x   x |"); 
            System.out.println("| x   x |"); 
            System.out.println("| x   x |"); 
            System.out.println("+-------+");  
        }
    }
}
