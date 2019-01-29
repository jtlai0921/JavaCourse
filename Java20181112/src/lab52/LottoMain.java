package lab52;

import java.util.Random;
import java.util.concurrent.Executor;

class Lotto implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + (new Random().nextInt(46) + 1));
    }
}

class LottoExecutor implements Executor {

    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
    
}

public class LottoMain {
    public static void main(String[] args) {
        LottoExecutor executor = new LottoExecutor();
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
        executor.execute(new Lotto());
    }
}

