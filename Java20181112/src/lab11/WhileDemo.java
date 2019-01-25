package lab11;

import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
        int amount = 0;
        
        outer:
        while(true) {
            int count = 0;
            amount++;
            inner:
            while(true) {
                int n = new Random().nextInt(10);
                if(n % 2 == 0) {
                    System.out.print(n + "\t");
                    count++;
                    if(count == 4) {
                        System.out.println("\n--------------" + amount);
                        break outer;
                    }
                }    
                else {
                    break inner; // break;
                }
            }
            System.out.println("\n--------------");
        }
    }
}
