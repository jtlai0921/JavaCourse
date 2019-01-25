package lab41;

public class Walking extends Thread {
    
    // 工作
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 走了 %d 步\n", name, i);
        }
        
    }
    
}
