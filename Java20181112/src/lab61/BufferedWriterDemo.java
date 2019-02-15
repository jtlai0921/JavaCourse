package lab61;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file = new File("src/lab61/files/demo.txt");
        if(!file.exists()) {
            System.out.println(file.getAbsoluteFile() + " 不存在");        
            return;
        }
        
        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);) {
            
            String[] rows = {"Hello", "爪哇"};
            
            for(String row : rows) {
                bw.write(row);
                bw.newLine();
            }
            
        } catch (Exception e) {
        }
    }
}
