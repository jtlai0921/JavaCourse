package lab51;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Semaphore_Demo {
    public static void main(String[] args) {
        
        int p = 10;
        int m = 3;
        
        Semaphore semaphore = new Semaphore(m, true);
        
        for(int i=0;i<p;i++) {
            new Worker(i, semaphore).start();
        }
        
    }
    
    static class Worker extends Thread {
        int i;
        Semaphore semaphore;

        public Worker(int i, Semaphore semaphore) {
            this.i = i;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(i + " 正在用機器");
                Thread.sleep(new Random().nextInt(3000) + 2000);
                System.out.println(i + " 用完機器並釋放");
                semaphore.release();
            } catch (Exception e) {
            }
        }
        
        
        
    }
}
