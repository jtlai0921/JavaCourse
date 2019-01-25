package lab9;

public class ArrayDemo2 {
    public static void main(String[] args) {
        
        double[][] values = {{170, 60}, {161, 48}, {168, 68}};
        
        for(double[] value : values) {
            double h = value[0];
            double w = value[1];
            double bmi = w / Math.pow(h/100, 2);
            System.out.printf("h = %.1f w = %.1f bmi = %.2f\n", h, w, bmi);
        }
        
        
        
    }
}
