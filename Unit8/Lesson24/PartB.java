import java.util.Scanner;

class Counter {
    private int count;

    public int getValue() {
        return count;
    }

    public void count() {
        count += 1;
    }

    public void reset() {
        count = 0;
    }
}

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();
        Scanner in = new Scanner(System.in); 



        char count;
        do {
            System.out.print("Input 'c' for cake, 'p' for pie, or 'q' to quit: ");
            count = in.next().charAt(0);
            if (count == 'c'){
                cakeCounter.count();
                //break;
            } else if (count == 'p') {
                pieCounter.count();
                //break
            } else if (count == 'q') {
                break;
            } else {
                System.out.println("Invalid input. Please try again: ");
            }
        } while (count != 'q');

        System.out.println("Total votes for cake: " + cakeCounter.getValue());
        System.out.println("Total votes for pie: " + pieCounter.getValue());
    }
}