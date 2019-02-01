package lab57;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class InvokeAnyDemo {
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
        int result = service.invokeAny(task);
        System.out.println(result);
        service.shutdown();
    }
}
