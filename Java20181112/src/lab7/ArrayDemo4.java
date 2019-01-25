package lab7;

import java.util.Arrays;


public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = {10, 8, 5, 9, 9, 7, 6};
        
        int sum = 0;
        double count = 0;
        double avg = 0;
        for(int x : scores) {
            if(x >= 7) {
                sum += x;
                count += 1;
            }
        }
        avg = sum / count;
        System.out.println(sum);
        System.out.println(avg);
        // Java 8
        int sum2    = Arrays.stream(scores).filter(x -> x >= 7).sum();
        double avg2 = Arrays.stream(scores).filter(x -> x >= 7).average().getAsDouble();
        System.out.println(sum2);
        System.out.println(avg2);
    }
}
