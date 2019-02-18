package lab62;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class MyFileAndPath {
    public static void main(String[] args) {
        // 若 Stream 來自檔案，應透過 try-with-resources 確保目錄檔案也會被關閉
        // 找出 src/lab62/files/web2 字母超過20個字的前10大
        try(Stream<String> lines = Files.lines(Paths.get("src/lab62/files/web2"));) {
            
            lines.filter(s -> s.length() > 20)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(10)
                    .forEach(w -> System.out.printf("%s (%d)%n", w, w.length()));
            
        } catch (Exception e) {
        }
        
        
    }
}
