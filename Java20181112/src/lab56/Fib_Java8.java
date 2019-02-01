package lab56;


import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Fib_Java8 {
    public static List<Long> fib(int num) {
        return Stream.iterate(new long[]{0, 1}, s -> new long[]{s[1], s[0] + s[1]})
                .parallel()
                .limit(num)
                .map(n -> n[0])
                .collect(toList());
    }
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}
