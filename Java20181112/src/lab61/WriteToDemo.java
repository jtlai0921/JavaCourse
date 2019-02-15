package lab61;

import java.io.File;
import java.io.FileWriter;

public class WriteToDemo {
    public static void main(String[] args) {
        File file = new File("src/lab61/files/demo.txt");
        if(!file.exists()) {
            System.out.println(file.getAbsoluteFile() + " 不存在");        
            return;
        }
        
        try (FileWriter wr = new FileWriter(file, false);) { // false是預設, 不保留原資料 . true 保留原資料
            String data1 = "I Love ";
            String data2 = "Java";
            wr.write(data1);
            wr.write("\n");
            wr.write(data2);
            System.out.println("寫入成功 !");
        } catch(Exception e) {
            
        }

        
        
        
        
    }
}
