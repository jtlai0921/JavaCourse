package lab57;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(new Random().nextInt(2000));
        int number = (int)(Math.random() * 100);
        System.out.println("\t得到 " + number + " 的時間:" + new Date());
        return number;
    }
}
