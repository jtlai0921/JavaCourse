package lab62;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyFile3 {
    public static void main(String[] args) throws IOException {
        Path src = Paths.get("src/lab62/demo3.txt");
        Path dest = Paths.get("src/lab62/files/demo3.txt");
        
        Files.move(src, dest, StandardCopyOption.ATOMIC_MOVE);
        //Files.delete(src);
              
        System.out.println("MOVE ok");
                
                
    }
}
