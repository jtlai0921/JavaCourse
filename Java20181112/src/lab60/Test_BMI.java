package lab60;

import java.util.Arrays;
import java.util.List;

class BMI {
    double w;
    double h;

    public BMI(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "BMI{" + "w=" + w + ", h=" + h + '}';
    }
    
}

public class Test_BMI {
    public static void main(String[] args) {
        List<BMI> bmis = Arrays.asList(new BMI(60, 170), new BMI(86, 175), new BMI(55, 180), new BMI(70, 150), new BMI(65, 172));
        bmis.stream()
                .forEach(System.out::println);
        System.out.println("---------------------------");
        
        bmis.stream()
                .peek(bmi -> System.out.println(bmi.w/Math.pow(bmi.h/100, 2)))
                .forEach(System.out::println);
        
        System.out.println("---------------------------");
                
        bmis.stream()
                .filter(bmi -> bmi.w > 62)
                //.peek(System.out::println)
                .filter(bmi -> {
                    double value = bmi.w/Math.pow(bmi.h/100, 2);
                    return value > 18 && value <= 23;
                })
                //.peek(System.out::println)
                .forEach(System.out::println);
    }
}
