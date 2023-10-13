package Unit05.Unit06;

public class Approximation {
    public static void main(String[] args){
    double a = 1.2; 
    double b = 3.0;
    double c = a * b;
    double error = 1e-13;

    if(Math.abs(c - 3.6) < error) {
    System.out.println("c is around 3.6");
    } else {
    System.out.println("c is not 3.6");
    }

    }
}
