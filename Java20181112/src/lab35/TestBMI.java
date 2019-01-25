package lab35;

interface BMI {
    double calc(double w, double h);
}

public class TestBMI {
    public static void main(String[] args) {
        double w = 60;
        double h = 170;
        
        BMI bmi = new BMI() {
            @Override
            public double calc(double w, double h) {
                double bmi = w / Math.pow(h/100, 2);
                return bmi;
            }
        };
        System.out.println(bmi.calc(w, h));
        
        BMI bmi2 = (double w1, double h1) -> {
            double bmi1 = w1 / Math.pow(h1 / 100, 2);
            return bmi1;
        };
        System.out.println(bmi2.calc(w, h));
        
        BMI bmi3 = (w1, h1) -> {
            return w1 / Math.pow(h1 / 100, 2);
        };
        System.out.println(bmi3.calc(w, h));
        
        BMI bmi4 = (w1, h1) -> w1 / Math.pow(h1 / 100, 2);
        System.out.println(bmi4.calc(w, h));
        
    }
}
