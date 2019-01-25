package lab7;

import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] values = {10, 8, 5, 9, 9, 7, 6}; 
        
        int sum = Arrays.stream(values).map(x->(x%2==0)?x*x:x).sum();
        System.out.println(sum);
        System.out.println("--------------");
        Arrays.stream(values).map(x->(x%2==0)?x*x:x).forEach(System.out::println);
                
    }
}
