package lab42;

public class Lucky777 extends Thread {
    
    private static boolean stop = false;
    
    public Lucky777(String name) {
        setName(name);
    }
    
    @Override
    public void run() {
        String who = Thread.currentThread().getName();
        for(int i=1;!stop;i++) {
            int x = (int)(Math.random() * 1000);
            if(x == 777) {
                stop = true;
                System.out.printf("%b %s 總共取了 %d 次才得到 777\n", stop, who, i);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new Lucky777("小明");
        Thread t2 = new Lucky777("小華");
        
        t1.start();
        t2.start();
        
    }
    
}
