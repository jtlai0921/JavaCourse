package lab60;

import java.util.Arrays;
import java.util.function.Consumer;

public class TestConsumer2 {
    public static void main(String[] args) {
        String[] names = {"Vincent", "Anita", "Tom", "Joanna", "Howard", "Jean", "Jo", "Mary"};
        for(String name : names) {
            System.out.println(name);
        }
        
        Arrays.asList(names).forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
        Arrays.asList(names).forEach(name -> System.out.println(name));
        Arrays.asList(names).forEach(System.out::println);
        
        // Stream
        Arrays.stream(names).forEach(System.out::println);
    }
}
