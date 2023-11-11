package Unit05.Unit06.Unit07.Unit08;

public class Grades {
    public static void main(String[] args) {
        double cesium = 100;
        int years = 0;
        while (cesium > 1) {
            cesium = cesium/2.0;
            years = years + 30;
        }
        System.out.println("The amount of years this took is: " + years);
        //cesium = cesium * 100;
        System.out.println("The amount of cesium left is: " + cesium + "%");


    }
}