package lab44;

public class Main {

    public static void main(String[] args) {
        // Java 7
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    String tName = Thread.currentThread().getName();
                    System.out.printf("%s 跑了 %d 步\n", tName, i);
                }
            }
        };

        Thread t1 = new Thread(r, "小明");
        t1.start();
        
        // Java 8
        Runnable w = () -> {
            for (int i = 1; i <= 1000; i++) {
                String tName = Thread.currentThread().getName();
                System.out.printf("%s 走了 %d 步\n", tName, i);
            }
        };
        Thread t2 = new Thread(w, "Mary");
        t2.start();
    }
}
