package lab42;

import java.util.Random;

public class Running extends Thread {
    
    // 工作
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            int r = new Random().nextInt(1000) + 1;
            if(i == r) {
                try {
                    Thread.sleep(1000);
                    System.out.printf("%s 停 1 秒,  %d == %d \n",name, i, r);
                } catch (InterruptedException ex) {
                }
            }
            System.out.printf("%s 跑了 %d 步\n", name, i);
        }
        
    }
    
}
