package lab9;

import java.util.Arrays;

public class ArrayDemo3 {

    public static void main(String[] args) {

        double[][] values = {{170, 60}, {161, 48}, {168, 68}};

        // Java 7
        for (double[] value : values) {
            double h = value[0];
            double w = value[1];
            double bmi = w / Math.pow(h / 100, 2);
            System.out.printf("h = %.1f w = %.1f bmi = %.2f\n", h, w, bmi);
        }
        System.out.println("------------------------------");
        // Java 8
        Arrays.stream(values).forEach(value -> {
            double h = value[0];
            double w = value[1];
            double bmi = w / Math.pow(h / 100, 2);
            System.out.printf("h = %.1f w = %.1f bmi = %.2f\n", h, w, bmi);
        });
        System.out.println("------------------------------");
        Arrays.stream(values)
                .filter(value -> value[0] > 165)
                .filter(value -> value[1] > 60)
                .forEach(value -> {
                    double h = value[0];
                    double w = value[1];
                    double bmi = w / Math.pow(h / 100, 2);
                    System.out.printf("h = %.1f w = %.1f bmi = %.2f\n", h, w, bmi);
                });

    }
}
