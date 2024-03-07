import java.util.ArrayList;
import java.util.Scanner;

class CashRegister {
    private ArrayList<Double> items;
    private double total;

    public CashRegister() {
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public void addItem(double price) {
        items.add(price);
        total = total + price;
    }

    public void removeItem() {
        if (!items.isEmpty()) {
            total -= items.remove(items.size() - 1);
        }
    }

    public double getTotal() {
        return total;
    }

    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
        total = 0.0;
    }
}

public class PartB {
    public static void main(String[] args) throws InterruptedException{
        CashRegister cr = new CashRegister();
        Scanner in = new Scanner(System.in);

        char choice = ' ';

        while (choice != 'q') {
            System.out.print("Enter 'a' to add an item, 'r' to remove the last item, 't' to display total, 'c' to clear, or 'q' to quit: ");
            choice = in.next().charAt(0);


            if (choice == 'a') {
                System.out.print("Enter the price of the item: ");
                double price = in.nextDouble();
                cr.addItem(price);
                System.out.println("Item added. Total: " + cr.getTotal() + ", Count: " + cr.getCount());
            } else if (choice == 'r') {
                cr.removeItem();
                System.out.println("Last item removed. Total: " + cr.getTotal() + ", Count: " + cr.getCount());
            } else if (choice == 't') {
                System.out.println("Total: " + cr.getTotal() + ", Count: " + cr.getCount());
            } else if (choice == 'c') {
                cr.clear();
                System.out.print("Cleared.");
            } else if (choice == 'q') {
                System.out.println("Terminating");
                Thread.sleep(831);
                System.out.println("beep");
                Thread.sleep(401);
                System.out.println("boop");
            } else {
                System.out.print("Invalid Input. Please try again.");
            }

        } 

        in.close();
    }
}