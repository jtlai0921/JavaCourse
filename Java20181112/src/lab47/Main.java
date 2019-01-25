package lab47;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("我要一個 luckyNumber ");        
        LuckyNumber luckyNumber = new LuckyNumber();
        FutureTask<Integer> task = new FutureTask<>(luckyNumber);
        System.out.println("啟動一條執行緒"); 
        new Thread(task).start();
        System.out.println("等待取得資料中.."); 
        int num = task.get();
        System.out.println("我得到的是 : " + num);
        
        
        System.out.println("我等待中...");
    }
}
