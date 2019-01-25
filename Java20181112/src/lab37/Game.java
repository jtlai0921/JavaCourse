package lab37;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int count = 0;
        while(count < 5) {
            int number = 0;
            while(true) {
                number = new Random().nextInt(13) + 1;
                if(number != 7) break;
            }
            //System.out.println(number);
            Scanner scanner = new Scanner(System.in);
            System.out.println("請猜比 7 大 or 比 7 小 (1 or 0) ?");
            int guess = scanner.nextInt();
            count++;
            if(guess == 1 && number > 7) {
                System.out.println("答對了 " + number);
            } else if(guess == 0 && number < 7) {
                System.out.println("答對了 " + number);
            } else {
                System.out.println("答錯了 " + number);
                break;
            }
        }
        System.out.println("Game Over !");
        
    }
}
