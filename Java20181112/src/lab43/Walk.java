package lab43;

public class Walk implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<=1000;i++) {
            String tName = Thread.currentThread().getName();
            System.out.printf("%s 走了 %d 步\n", tName, i);
        }
    }
    
}
