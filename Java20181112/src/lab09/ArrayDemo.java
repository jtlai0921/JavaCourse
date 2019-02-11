package lab09;

public class ArrayDemo {
    public static void main(String[] args) {
        
        double[][] values = {{170, 60}, {161, 48}, {168, 68}};
        
        System.out.println(values[0][0]);
        System.out.println(values[0][1]);
        double bmi0 = values[0][1]/Math.pow(values[0][0]/100, 2);
        System.out.printf("bmi = %.2f\n", bmi0);
        
        System.out.println(values[1][0]);
        System.out.println(values[1][1]);
        double bmi1 = values[1][1]/Math.pow(values[1][0]/100, 2);
        System.out.printf("bmi = %.2f\n", bmi1);
        
        System.out.println(values[2][0]);
        System.out.println(values[2][1]);
        double bmi2 = values[2][1]/Math.pow(values[2][0]/100, 2);
        System.out.printf("bmi = %.2f\n", bmi2);
        
        
    }
}
