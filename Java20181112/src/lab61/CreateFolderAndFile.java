package lab61;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {
    public static void main(String[] args) throws IOException {
        File fd = new File("src/lab61/files");
        if(!fd.exists()) {
            boolean success_fd = fd.mkdir();
            System.out.println("建立目錄成功 ?" + success_fd);
            if(success_fd) {
                String fn = "demo.txt";
                File file = new File(fd + "/" + fn);
                boolean success_fn = file.createNewFile();
                System.out.println("建立檔案成功 ?" + success_fn);
            }
        } else {
            System.out.println(fd.getAbsolutePath() + "已存在");
        }
    }
    
}
