import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your sphere's radius: ");
        double r = in.nextDouble();
        double surfaceArea = Geometry.calcSurfSphere(r);
        double volume = Geometry.calcVolSphere(r);


        System.out.println("Your sphere with a radius of " + r + ", has a surface area of " + surfaceArea + ", and a volume of " + (int)volume);

    }
}