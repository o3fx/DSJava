public class Block3Water {
    public static void sayHello(String name) {
        System.out.println("hello" + name);
    }

    public static double getAvg(double i, double n) {
        double avg = (i + n) / 2;
        return avg;
        
    }
    public static int getDif(int x, int y) {
        int diff = x - y;
        return diff;

    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        sayHello("Aaron");
        System.out.println("The avg of 3 and 5 is " + getAvg(3, 5));
        System.out.println("The dif of 3 and 5 is " + getDif(3, 5));
    }
    }
}
