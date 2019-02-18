package lab62;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/lab62/files/demo.txt");
        System.out.println(file.exists());
        
        Path path = file.toPath();
        byte[] bytes = Files.readAllBytes(path);
        String data = new String(bytes, "UTF-8");
        System.out.println(data);
        
        //System.out.println(new String(Files.readAllBytes(file.toPath())));
                
                
    }
}
