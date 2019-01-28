package lab51;
import java.util.concurrent.CountDownLatch;
public class CountDownLatch_Demo {
    public static void main(String[] args) {
        int n = 3;
        
        final CountDownLatch countDownLatch = new CountDownLatch(n) ;
        
        System.out.println("我要去考試");
        System.out.println("發現沒准考證");
        System.out.println("發現沒筆");
        
        // 去拿准考證 Thread
        new Thread(){
            @Override
            public void run() {
                System.out.println("去拿准考證");
                try {
                    Thread.sleep(5000);
                    System.out.println("拿到准考證");
                    countDownLatch.countDown();
                } catch (Exception e) {
                }
            }
        }.start();
        
        // 去拿筆 Thread
        new Thread(){
            @Override
            public void run() {
                System.out.println("去拿筆");
                try {
                    Thread.sleep(2000);
                    System.out.println("拿到筆");
                    countDownLatch.countDown();
                } catch (Exception e) {
                }
                
            }
        }.start();
        
        // 去拿筆 Thread
        new Thread(){
            @Override
            public void run() {
                System.out.println("去橡皮擦");
                try {
                    Thread.sleep(3000);
                    System.out.println("拿到橡皮擦");
                    countDownLatch.countDown();
                } catch (Exception e) {
                }
                
            }
        }.start();
        
        System.out.println("等待中...");
        try {
            // 等待 n 條 Thread 執行完畢
            countDownLatch.await();
        } catch (Exception e) {
        }
        System.out.println("開始考試");
    }
}
