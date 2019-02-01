package lab57;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Lotto> task = new ArrayList<>();
        task.add(new Lotto());
        task.add(new Lotto());
        task.add(new Lotto());
        task.add(new Lotto());
        task.add(new Lotto());
        task.add(new Lotto());
        task.add(new Lotto());
        task.add(new Lotto());
        List<Future<Integer>> results = service.invokeAll(task);
        for(Future<Integer> result : results) {
            System.out.print(result.get() + " ");
        }
        System.out.println();
        service.shutdown();
    }
}
