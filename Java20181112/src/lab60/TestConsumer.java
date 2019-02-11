package lab60;

import java.util.function.Consumer;

public class TestConsumer {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // 1.傳統用法
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object t) {
                System.out.println("我印出了 " + t);
            }
        };
        consumer.accept("Hello Consumer1");
        
        // 2.Lambda
        Consumer consumer2 = (Object t) -> {System.out.println("我印出了 " + t);};
        consumer2.accept("Hello Consumer2");
        
        Consumer consumer3 = t -> System.out.println("我印出了 " + t);
        consumer3.accept("Hello Consumer3");
        
        print("Hello Consumer4", t -> System.out.println("我想印 " + t));
        print("Hello Consumer5", t -> System.out.println("我想印這個 " + t));
        
    }
    
    public static void print(String data, Consumer consumer) {
        consumer.accept(data);
    }
    
}
