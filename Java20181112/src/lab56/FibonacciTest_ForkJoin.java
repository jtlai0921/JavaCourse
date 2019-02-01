package lab56;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class FibonacciTest_ForkJoin {
    public static void main(String[] args) {
        int n = 50;
        //ForkJoin
        long t1 = new Date().getTime();
        int processors = Runtime.getRuntime().availableProcessors();
        FibonacciTask task = new FibonacciTask(n);
        ForkJoinPool pool = new ForkJoinPool(processors);
        pool.invoke(task);
        System.out.print(task.getResult() + "，");
        long t2 = new Date().getTime();
        System.out.print("花費時間:" + (t2 - t1) + "，");
        System.out.println("Processors:" + processors);
    }
}
