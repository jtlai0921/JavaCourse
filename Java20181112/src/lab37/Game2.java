package lab37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Game2 {
    public static void main(String[] args) {
        int[] bonus = {50, 100, 500, 20000, 50000};
        Set<Integer> set = new HashSet<>();
        while(set.size() < 5) {
            int number = new Random().nextInt(13) + 1;
            if(number == 7) continue;
            set.add(number);
        }
        List<Integer> nums = new ArrayList<>(set);
        Collections.shuffle(nums);
        System.out.println(nums);
                
        for(int i=0;i<nums.size();i++) {
            int number = nums.get(i);
            Scanner scanner = new Scanner(System.in);
            System.out.println("請猜比 7 大 or 比 7 小 (1 or 0 or 2(不玩了, 拿一半)) ?");
            int guess = 0;
            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                i--;
                continue;
            }
            
            if(guess == 1 && number > 7) {
                System.out.println("答對了 " + number + " 獎金 $" + bonus[i]);
            } else if(guess == 0 && number < 7) {
                System.out.println("答對了 " + number + " 獎金 $" + bonus[i]);
            } else if(guess == 2) {
                System.out.println("遊戲提前結束 獎金 $" + ((i==0)?"0":bonus[i-1]/2));
                break;
            } else {
                System.out.println("答錯了 " + number + " 獎金 $0");
                break;
            }
        }
        System.out.println("Game Over !");
        
    }
}
