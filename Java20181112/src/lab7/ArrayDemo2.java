package lab7;

import java.util.Arrays;


public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = {100, 80, 90, 70};
        for(int x : scores) {
            System.out.println(x);
        }
        System.out.println("--------------");
        Arrays.sort(scores); // 排序
        for(int x : scores) {
            System.out.println(x);
        }
        System.out.println("max = " + scores[scores.length-1]);
        System.out.println("min = " + scores[0]);
        
    }
}
