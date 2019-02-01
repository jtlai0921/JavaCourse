package lab58;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ExecutorService  exec = Executors.newScheduledThreadPool(2);
        exec.execute(new Lotto("Vincent"));
        exec.execute(new Lotto("Anita"));
        exec.shutdown();
    }
}
