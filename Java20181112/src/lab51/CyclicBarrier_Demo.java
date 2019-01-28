package lab51;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
        
public class CyclicBarrier_Demo {
    public static void main(String[] args) {
        int n = 10;
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(n);
        
        for(int i=0;i<n;i++) {
            new Person(cyclicBarrier, i).start();
        }
    }
    
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
            try {
                Thread.sleep(new Random().nextInt(5000));
                System.out.println(i + " 已到機場, 等待其他人");
                // 等待其他人
                cyclicBarrier.await();
            } catch (Exception e) {
            }
            // 大家都集合完畢之後才要做的事情
            System.out.println(i + ((i%2==0)?" 去登機門":" 去吃飯"));
        }
        
    }
    
}
