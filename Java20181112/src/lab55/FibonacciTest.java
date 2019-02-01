package lab55;

import java.util.Date;

public class FibonacciTest {
    public static void main(String[] args) {
        int n = 39;
        Fibonacci fibonacci = new Fibonacci();
        long begin = new Date().getTime();
        System.out.println(fibonacci.f(n));
        long end = new Date().getTime();
        System.out.println("time : " + (end - begin));
        
    }
}
