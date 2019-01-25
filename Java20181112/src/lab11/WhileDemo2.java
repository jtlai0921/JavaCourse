package lab11;

import java.util.Random;

public class WhileDemo2 {
    public static void main(String[] args) {
        int answer = 724;
        int amount = 0;
        while(true) {
            amount++;
            int lotto = new Random().nextInt(1000);
            if(lotto == answer) {
                System.out.printf("買了 %d 張, 花了 $%d\n", amount, amount * 50);
                int money = 12500 - (amount * 50);
                System.out.println((money >= 0)?"賺 $" + money : "賠 $" + Math.abs(money));
                break;
            }
        }
        
    }
}
