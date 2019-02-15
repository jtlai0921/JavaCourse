package lab61;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownloadImage {
    public static void main(String[] args) {
        File file = new File("src/lab61/files/pic.jpg");
        //String urlString = "https://ari-sensei.com/wp-content/uploads/2018/06/168b3d-720x380.jpg";
        String urlString = "https://ari-sensei.com/wp-content/uploads/2018/06/sg2_L-297x300.png";
        
        try(InputStream is = new URL(urlString).openStream();
            FileOutputStream fos = new FileOutputStream(file);) {
            do {                
                int code = is.read();
                if(code == -1) break;
                fos.write(code);
            } while (true);
            System.out.println("寫入Image成功");
        } catch (Exception e) {
        }
    }
    
}
