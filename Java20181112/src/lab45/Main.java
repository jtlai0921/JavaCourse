package lab45;

public class Main {

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 1; i <= 1000; i++) {
                String tName = Thread.currentThread().getName();
                System.out.printf("%s 跑了 %d 步\n", tName, i);
            }
        };
        Runnable w = () -> {
            for (int i = 1; i <= 1000; i++) {
                String tName = Thread.currentThread().getName();
                System.out.printf("%s 走了 %d 步\n", tName, i);
            }
        };
        
        Thread t1 = new Thread(r, "小明");
        Thread t2 = new Thread(w, "Mary");
        t1.setDaemon(true);
        
        t1.start();
        t2.start();
    }
}
