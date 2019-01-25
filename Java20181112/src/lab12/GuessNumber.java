package lab12;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        final int COUNT = 5; // 總共可猜次數
        int corrent_count = 0; // 目前是猜第幾次
        int min = 0;
        int max = 100;
        int ans = new Random().nextInt(99) + 1;
        System.out.printf("猜數字遊戲每次10元可猜 %d 次, 猜對50元\n", COUNT);
        
        do {            
            // count 次數是否足夠 ?
            if(corrent_count == COUNT) {
                System.out.println("Sorry 次數用完了, 請再投10元~");        
                break;
            }
            ++corrent_count;
            Scanner scanner = new Scanner(System.in);
            System.out.printf("(第 %d 次) 請輸入數字 %d ~ %d\n", corrent_count, min, max);
            int guess = scanner.nextInt();
            
            // 檢查範圍
            if (!(guess > min && guess < max)) {
                System.out.println("數字範圍錯誤, 請重新輸入...");
                continue;
            }
            // 檢查是否猜對
            if(guess == ans) {
                System.out.println("答對了 !");
                break; 
            } else if(guess > ans) {
                max = guess;
            } else {
                min = guess;
            }
            
        } while (true);
        
        
    }
}
