package lab11;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        int answer = new Random().nextInt(10) + 1; // 0~9 + 1 => 1 ~ 10
        do {            
            System.out.println("請猜數字");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if(score == answer) {
                System.out.println("答對了 " + score + " == " + answer);
                break;
            }
        } while (true);
        
    }
}
