package lab49;

public class Sync implements Runnable{
    
    public void print() {
        System.out.println("進入 print()");
        System.out.println("I'm print");
    }
    
    public synchronized void click() {
        System.out.println("進入 synchronized click()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println("I'm synchronized click");
    }
    
    public void run() {
        String tName = Thread.currentThread().getName();
        if(tName.equals("A")) click();
        else print();
    }
    
    public static void main(String[] args) {
        Sync m1 = new Sync();
        
        new Thread(m1, "A").start();
        new Thread(m1, "B").start();
    }
    
}
