package lab50;

public class Cookies {
    
    private boolean empty = true;
    
    public synchronized void eat(int num) {
        while(empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("小白狗吃了第 " + num + " 片餅乾");
        notifyAll(); // 叫主人 master
        empty = true; // 餅乾吃完了
    }
    
    public synchronized void put(int num) {
        while(!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("主人放了第 " + num + " 片餅乾");
        notifyAll(); // 叫小狗來吃
        empty = false; // 餅乾放好了
    }
    
}
