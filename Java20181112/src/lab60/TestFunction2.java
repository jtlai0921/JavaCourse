package lab60;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestFunction2 {
    public static void main(String[] args) {
        String[] names = {"Vincent", "Anita", "Tom", "Joanna", "Howard", "Jean", "Jo", "Mary"};
        
        Arrays.stream(names)
                .map(name -> name.length())   // Function
                .forEach(System.out::println);// Consumer
        
        List<Integer> list = Arrays.stream(names)
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.get(1));
        
        // IntSummaryStatistics
        IntSummaryStatistics stat = Arrays.stream(names)
                .map(name -> name.length())
                .collect(Collectors.summarizingInt(n -> n));
        System.out.println(stat);
        System.out.println(stat.getMax()); 
        
        // mapToInt
        int sum = Arrays.stream(names)
                .mapToInt(name -> name.length())
                .sum();
        System.out.println(sum);
                
    }
}
