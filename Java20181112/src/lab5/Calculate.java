package lab5;

public class Calculate {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.w = 60.5;
        b1.h = 170.2;
        b1.calcBMI();
        
        BMI b2 = new BMI();
        b2.w = 45;
        b2.h = 150;
        b2.calcBMI();
        
        System.out.println(b1.bmi);
        System.out.println(b2.bmi);
    }
}
