package lab62;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyFile2 {
    public static void main(String[] args) throws IOException {
        Path src = Paths.get("src/lab62/demo2.txt");
        Path dest = Paths.get("src/lab62/files/demo2.txt");
        
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
        //Files.delete(src);
              
        System.out.println("COPY ok");
                
                
    }
}
