package lab61;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file = new File("src/lab61/files/demo.txt");
        if(!file.exists()) {
            System.out.println(file.getAbsoluteFile() + " 不存在");        
            return;
        }
        
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);) {
            
            /*
            String data = "";
            while((data = br.readLine()) != null) {
                System.out.println(data);
            }
            */
            
            do {                
                String data = br.readLine();
                if(data == null) break;
                System.out.println(data);
            } while (true);
            
            System.out.println();
        } catch (Exception e) {
        }
        
    }
}
