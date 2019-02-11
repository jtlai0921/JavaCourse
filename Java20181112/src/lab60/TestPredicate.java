package lab60;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestPredicate {

    public static void main(String[] args) {
        String[] names = {"Vincent", "Anita", "Tom", "Joanna", "Howard", "Jean", "Jo", "Mary"};
        // 陣列轉 stream ==> Arrays.stream(names)
        Arrays.stream(names)
                .map(name -> name.length())
                .filter(length -> length >= 5)
                .forEach(System.out::println);

        List<Integer> scores = Arrays.asList(100, 60, 50, 80, 40, 30, 90);
        // 集合轉 stream ==> scores.stream()
        // 請列出統計數據但是只算及格者

        IntSummaryStatistics stat = scores.stream()
                .filter(score -> score >= 60)
                .collect(Collectors.summarizingInt(score -> score));
        System.out.println(stat);
    }
}
