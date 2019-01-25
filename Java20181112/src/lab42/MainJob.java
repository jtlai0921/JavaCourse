package lab42;

public class MainJob {
    public static void main(String[] args) {
        Thread t1 = new Running();
        Thread t2 = new Running();
        t1.setName("兔子");
        t2.setName("烏龜");
        t1.start();
        t2.start();
    }
}
