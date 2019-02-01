package lab56;

import java.util.concurrent.RecursiveTask;
import lab55.Fibonacci;

public class FibonacciTask extends RecursiveTask<Long> {
    private int num = 0;
    private long result = 0;
    FibonacciTask(int num) {
        this.num = num;
    }
    public long getResult() {
        return result;
    }
    @Override
    protected Long compute() {
        if(num < 39) {
            // 小於39就直接利用單執行緒遞迴求解
            result = new Fibonacci().f(num);
        } else {
            FibonacciTask task1 = new FibonacciTask(num - 1);
            task1.fork();
            FibonacciTask task2 = new FibonacciTask(num - 2);
            result = task2.compute() + task1.join();
        }
        return result;
    }
}

