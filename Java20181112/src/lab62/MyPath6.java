package lab62;

import java.nio.file.Path;
import java.nio.file.Paths;

// 考題
public class MyPath6 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Pics/MyPic.jpeg");
        System.out.println (
                p1.getNameCount() +
                "\n" + p1.getName(0) +
                "\n" + p1.getName(1) +
                "\n" + p1.getFileName()); // getFileName() 會取得最後一個名稱
    }
}
