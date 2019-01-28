package lab51;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
        
public class CyclicBarrier_Demo3 {
    public static void main(String[] args) {
        int n = 5;
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(n, r);
        
        for(int i=0;i<n;i++) {
            new Person(cyclicBarrier, i).start();
        }
    }
    
    // 導遊
    static Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("發機票");
        }
    };
    
    static class Person extends Thread {
        CyclicBarrier cyclicBarrier;
        int i;
        public Person(CyclicBarrier cyclicBarrier, int i) {
            this.cyclicBarrier = cyclicBarrier;
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(i + " 出發到機場");
            int timeout = new Random().nextInt(5000);
            try {
                Thread.sleep(timeout);
                System.out.println(i + " 已到機場, 等待其他人 timeout=" + timeout);
                // 等待其他人
                cyclicBarrier.await(2000, TimeUnit.MILLISECONDS);
            } catch(TimeoutException e) {
                System.out.println(i + " timeout=" + timeout + " 等不及了");
                
            } catch (BrokenBarrierException e) {
                
            } catch (InterruptedException e) {
                //System.out.println(i + " InterruptedException" + timeout);
            }
            // 大家都集合完畢之後才要做的事情
            System.out.println(i + ((i%2==0)?" 去登機門":" 去吃飯"));
        }
        
    }
    
}
