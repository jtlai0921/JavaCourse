package lab53;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

class Lotto implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + (new Random().nextInt(46) + 1));
    }
}

class Lotto2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return (new Random().nextInt(46) + 1);
    }
    
}

public class LottoPoolMain {
    public static void main(String[] args) throws Exception {
        
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        //ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        poolExecutor.execute(new Lotto());
        poolExecutor.submit(new Lotto());
        poolExecutor.execute(new Lotto());
        
        Future<Integer> future1 = poolExecutor.submit(new Lotto2());
        Future<Integer> future2 = poolExecutor.submit(new Lotto2());
        Future<Integer> future3 = poolExecutor.submit(new Lotto2());
        System.out.println(future1.get() + 1000);
        System.out.println(future2.get() + 1000);
        System.out.println(future3.get() + 1000);
        System.out.println("Thread count : " + Thread.activeCount());
        poolExecutor.shutdown();
        
        
    }
}
