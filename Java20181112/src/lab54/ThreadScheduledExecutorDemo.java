package lab54;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledExecutorDemo {

    public static void main(String[] args) {

        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        // 1.schedule
        //exec.schedule(new Lotto(), 2, TimeUnit.SECONDS);
        
        // 2.scheduleWithFixedDelay
        //exec.scheduleWithFixedDelay(new Lotto(), 0, 2, TimeUnit.SECONDS);
        
        // 3.scheduleWithFixedDelay
        exec.scheduleAtFixedRate(new Lotto(), 0, 2, TimeUnit.SECONDS);
        //exec.shutdown();
        
    }
}
