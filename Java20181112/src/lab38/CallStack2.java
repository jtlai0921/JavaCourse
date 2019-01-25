package lab38;

import java.io.File;
import java.io.IOException;

public class CallStack2 {
    public static void main(String[] args) {
        employee("emp.txt");
        try {
            manager("mgr.txt");
        } catch (IOException e) {
            System.out.println("main 來處理:" + e);
        }
    }
    
    public static void employee(String fName) {
        try {
            createFile(fName);
        } catch (IOException e) {
            System.out.println("請 manager 處理:" + e);        
        }
    }
    
    public static void manager(String fName) throws IOException {
        createFile(fName);
    }
    
    public static void createFile(String fName) throws IOException {
        File file = new File("src/lab38abc/" + fName);
        file.createNewFile();
    }
}
