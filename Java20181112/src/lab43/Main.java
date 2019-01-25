package lab43;

public class Main {
    public static void main(String[] args) {
        // 工作 --> Runnable 物件
        Run r = new Run();
        Walk w = new Walk();
        
        Thread t1 = new Thread(r, "小明");
        Thread t2 = new Thread(w, "Mary");
        
        t1.start();
        t2.start();
        
        
    }
}
