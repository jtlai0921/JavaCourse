package lab05;

public class BMI {
    public double w;
    public double h;
    public double bmi;
    
    public void calcBMI() {
        bmi = w / ((h/100)*(h/100));
    }
}
