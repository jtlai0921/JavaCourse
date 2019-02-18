package lab62;

import java.nio.file.Path;
import java.nio.file.Paths;

// 考題
public class MyPath5 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log"); // 相對路徑 --> /app/./sys/log
        System.out.println(res1);

        Path path2 = Paths.get("/server/exe/");
        Path res2 = path1.resolve("/readme/"); // 因為前方有 / 所以為絕對路徑 --> /readme
        System.out.println(res2);
    }
}
