class Die {
    // member variables
    private int r;

    // contrusturs
    public Die() {
        // initialize die
        r = 6;
    }


    // methods
    // It isn't static because it changes
    public int getFaceValue() {
        return r;
    }

    public void roll() {
        int max = 6;
        int min = 1;
        double val = 0;
        val = Math.floor(Math.random() * (max - min + 1));
        r = (int)val;
    }
    public Die(int newValue) {
        r = newValue;
    }

    public void display() {
        if (r == 1) {
            System.out.println("+-------+");
            System.out.println("|       |"); 
            System.out.println("|   x   |"); 
            System.out.println("|       |"); 
            System.out.println("+-------+");
        } else if (r == 2) {
            System.out.println("+-------+");
            System.out.println("| x     |"); 
            System.out.println("|       |"); 
            System.out.println("|    x  |"); 
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
    public void setFaceValue(int newValue) {
        if (newValue > 0 && newValue < 7) {
            r = newValue;
        } else {
            System.out.print("Error new value must be between 1 and 6");
        }
        r = newValue;
    }
}


public class DiceRollExample {
    public static void main(String[] args) {
        Die die = new Die();
        die.display();
        die.roll();
        die.display();
        Die die2 = new Die(3);
        die2.display();

    }
}
