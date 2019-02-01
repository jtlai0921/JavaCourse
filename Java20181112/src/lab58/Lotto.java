package lab58;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Lotto implements Runnable {
    private String username;
    private static final ReentrantLock lock = new ReentrantLock();
    public Lotto(String username) {
        this.username = username;
    }
    @Override
    public void run()  {
        try{
            lock.lock();
            for(int i=1;i<=5; i++) {
                Thread.sleep(new Random().nextInt(1000)); //模擬要花費的時間
                int number = (int)(Math.random() * 100);
                System.out.println(username + " 得到第 " + i + " 組號碼:" + 
                                   number + " ,時間:" + new Date());
            }
            
        } catch(Exception e){
        } finally {
            lock.unlock();
        }
    }
}
