package lab41;

public class MainJob {
    public static void main(String[] args) {
        Thread t1 = new Running();
        Thread t2 = new Walking();
        t1.setName("兔子");
        t2.setName("烏龜");
        //t1.setPriority(Thread.MIN_PRIORITY); // 設定權限 1~10
        //t2.setPriority(Thread.MAX_PRIORITY); // 設定權限 1~10
        t1.start();
        t2.start();
    }
}
