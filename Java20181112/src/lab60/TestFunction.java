package lab60;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        
        Function<Integer, Double> circle = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer r) {
                return r * r * 3.14;
            }
        };
        System.out.println(circle.apply(10));
        
        Function<Integer, Double> circle2 = r -> r * r * 3.14;
        System.out.println(circle2.apply(10));
        
        System.out.println(compute(10, r -> r * r * 3.14));
        System.out.println(compute(10, r -> r * r * 1.0));
        System.out.println(compute(10, r -> r * 2.0));         
        System.out.println(compute(5, 10, (x, y) -> x * y)); 
    }
    
    public static double compute(int x, Function<Integer, Double> function) {
        return function.apply(x);
    }
    
    public static int compute(int x, int y, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(x, y);
    }
    
}
