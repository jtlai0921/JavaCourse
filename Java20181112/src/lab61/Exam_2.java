package lab61;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Exam_2 {
     public static void main(String[] args) throws IOException {
        String fn = "src/lab61/files/exam_2.properties";
        
        FileInputStream fis = new FileInputStream (fn);
        Properties prop = new Properties ();
        prop.load(fis);
        System.out.println(prop.getProperty("welcome1"));
        System.out.println(prop.getProperty("username"));        
        System.out.println(prop.getProperty("password"));        
        System.out.println(prop.getProperty("welcome2"));
        System.out.println(prop.getProperty("welcome3", "Ha Ha"));
    }
}
