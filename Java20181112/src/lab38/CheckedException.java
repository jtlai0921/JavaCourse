package lab38;

import java.io.File;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        File f = new File("src/lab38/note.txt");
        try {
            boolean check = f.createNewFile();
            System.out.println(check);
        } catch(IOException e) {
            System.out.println("建檔失敗:" + e.getMessage());
            System.out.println("建檔失敗:" + e.getLocalizedMessage());
            System.out.println(e);
            e.printStackTrace(System.out); // 詳細錯誤資料
        }
        
    }
}
