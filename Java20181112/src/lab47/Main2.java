package lab47;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

public class Main2 {
    public static void main(String[] args) throws Exception {
        System.out.println("我要數個 luckyNumber ");        
        LuckyNumber luckyNumber = new LuckyNumber();
        List<FutureTask<Integer>> list = new ArrayList<>();
        list.add(new FutureTask<>(luckyNumber));
        list.add(new FutureTask<>(luckyNumber));
        list.add(new FutureTask<>(luckyNumber));
        list.add(new FutureTask<>(luckyNumber));
        list.add(new FutureTask<>(luckyNumber));
        list.add(new FutureTask<>(luckyNumber));
        
        for(FutureTask<Integer> task : list) {
            System.out.println("啟動一條執行緒");
            new Thread(task).start();
            System.out.println("等待取得資料中.."); 
            int num = task.get();
            System.out.println("我得到的是 : " + num);
        }
        
    }
}
