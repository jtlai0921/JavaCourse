package lab60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        
        Supplier temp = () -> {
            return new Random().nextInt(10) + 10;
        };
        System.out.println("現在氣溫 = " + temp.get());
        
        System.out.println(getLotto(6, ()-> new Random().nextInt(46) + 1));
        System.out.println(getLotto(5, ()-> new Random().nextInt(39) + 1));
                
    }
    
    public static Set<Integer> getLotto(int amount, Supplier<Integer> supplier) {
        Set<Integer> set = new HashSet<>();
        while(set.size() < amount) {
            set.add(supplier.get());
        }
        return set;
    }
    
}
