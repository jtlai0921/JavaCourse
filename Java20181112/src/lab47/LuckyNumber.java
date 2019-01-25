package lab47;

import java.util.Random;
import java.util.concurrent.Callable;

public class LuckyNumber implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("LuckyNumber 進行中...");
        Thread.sleep(3000);
        int num = new Random().nextInt(100);
        return num;
    }
    
}
