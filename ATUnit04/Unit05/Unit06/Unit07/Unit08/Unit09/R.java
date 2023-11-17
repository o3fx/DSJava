package Unit05.Unit06.Unit07.Unit08.Unit09;

public class R {
        public static void main(String[] args) {
        int q = 0;
        double l = 0;
        for (int i = 1; i <= 10; i++) {
        double r = Math.random();
        r = r * 10;
        r = (int)r;
        if (r == 0) {
            r = 1;
            
        }
        System.out.println(r);
        q = q + (int)r;
        }
        l = (double) q / 10.0;
        System.out.println("The average is: " + l);
    } 
}
