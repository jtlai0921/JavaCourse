package lab54;

import java.util.Date;
import java.util.Random;

public class Lotto implements Runnable {
    @Override
    public void run()  {
        System.out.print("計算中...");
        try{
            Thread.sleep(new Random().nextInt(2000)); //模擬要花費的時間
        }catch(Exception e){}        
        int number = (int)(Math.random() * 100);
        System.out.println("\t得到 " + number + " 的時間:" + new Date());
    }
}

