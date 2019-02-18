package lab62;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPath3 {

    public static void main(String[] args) {
        Path path1 = Paths.get("c:/home");
        Path path2 = Paths.get("c:/home/sally/bar");
        // 我是 path1 要如何到達 path2
        //Path path1_to_path2 = path1.relativize(path2);
        //System.out.println(path1_to_path2);
        
        // 我是 path2 要如何到達 path1
        Path path2_to_path1 = path2.relativize(path1);
        System.out.println(path2_to_path1);
                
    }
}
