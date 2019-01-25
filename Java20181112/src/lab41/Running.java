package lab41;

import java.util.Random;

public class Running extends Thread {
    
    // 工作
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", name, i);
        }
        
    }
    
}
