package lab62;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPath4 {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\temp\\Company\\Finance\\Salary.dat");
        
        Path root = Paths.get("C:\\temp");
        Path file = Paths.get("Salary.dat");

        System.out.println(path.startsWith(root)); // true 起始相同 
        System.out.println(path.endsWith(file)); // true 結尾相同

    }
}
