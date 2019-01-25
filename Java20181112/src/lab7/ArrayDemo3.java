package lab7;

import java.util.Arrays;


public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {10, 8, 5, 9, 9, 7, 6};
        Arrays.sort(scores);
        int sum = scores[2] + scores[3] + scores[4];
        double avg = sum / 3.0;
        System.out.println("avg " + avg);
        
        for(int x : scores) {
            if(x >= 7) {
                System.out.println(x);
            }
        }
        System.out.println("------------");
        Arrays.stream(scores)
                .filter(x -> x >= 7)
                .forEach(x->System.out.println(x));
        Arrays.stream(scores)
                .filter(x -> x >= 7)
                .forEach(System.out::println);
        
    }
}
