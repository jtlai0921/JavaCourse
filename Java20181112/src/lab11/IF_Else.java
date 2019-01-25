package lab11;

import java.util.Random;

public class IF_Else {
    public static void main(String[] args) {
        
        int n = new Random().nextInt(10); // 0~9
        System.out.println("n = " + n);
        
        if(n % 2 == 0) 
            System.out.println("偶數");
        else
            System.out.println("奇數");
        
        System.out.println((n % 2 == 0)?"偶數":"奇數");
        
    }
}
