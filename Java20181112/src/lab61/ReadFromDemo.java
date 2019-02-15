package lab61;

import java.io.File;
import java.io.FileReader;

public class ReadFromDemo {
    public static void main(String[] args) {
        File file = new File("src/lab61/files/demo.txt");
        if(!file.exists()) {
            System.out.println(file.getAbsoluteFile() + " 不存在");        
            return;
        }
        
        try(FileReader fr = new FileReader(file)) {
            StringBuilder sb = new StringBuilder();
            do {                
                int code = fr.read();
                if(code == -1) break;
                sb.append((char)code);
            } while (true);
            System.out.println(sb);
        } catch (Exception e) {
        }
    }
}
