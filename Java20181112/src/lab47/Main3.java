package lab47;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

public class Main3 {
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
        
        System.out.println("啟動 6 條執行緒");
        new Thread(list.get(0)).start();
        new Thread(list.get(1)).start();
        new Thread(list.get(2)).start();
        new Thread(list.get(3)).start();
        new Thread(list.get(4)).start();
        new Thread(list.get(5)).start();
        
        System.out.println("等待取得資料中..");
        System.out.println("我得到的是 : " + list.get(0).get());
        System.out.println("我得到的是 : " + list.get(1).get());
        System.out.println("我得到的是 : " + list.get(2).get());
        System.out.println("我得到的是 : " + list.get(3).get());
        System.out.println("我得到的是 : " + list.get(4).get());
        System.out.println("我得到的是 : " + list.get(5).get());
        
        
    }
}
