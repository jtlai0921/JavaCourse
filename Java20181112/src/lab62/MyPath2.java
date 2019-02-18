package lab62;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPath2 {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/temp/Company/Finance/"); 
        Path path2 = Paths.get("aaa/bbb/Salary.dat"); 
        path1 = path1.resolve(path2); 
        System.out.println(path1);
                
    }
}
