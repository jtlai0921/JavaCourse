package lab62;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPath {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Program Files\\Java\\jdk1.8.0_191\\bin\\java.exe");
        System.out.println(path);
        System.out.println(path.getFileName());
        
        Path path2 = Paths.get("C:\\Program Files\\..\\jdk1.8.0_191\\bin\\java.exe").normalize();
        System.out.println(path2);
        System.out.println(path2.getFileName());
        
    }
}
