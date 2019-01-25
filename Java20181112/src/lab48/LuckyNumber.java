package lab48;

import java.util.Random;

public class LuckyNumber extends Thread {
    private Callback callback;
    
    public LuckyNumber(Callback callback) {
        this.callback = callback;
    }
    
    @Override
    public void run() {
        System.out.println("LuckyNumber 進行中...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        int num = new Random().nextInt(100);
        System.out.println("親愛的說給你:" + num);
        callback.putNum(num);
    }
    
}
