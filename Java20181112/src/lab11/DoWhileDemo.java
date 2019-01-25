package lab11;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        
        do {            
            System.out.println("請輸入分數");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if(score < 60) {
                break;
            } else {
                System.out.println("score = " + score);
            }
        } while (true);
        
    }
}
