package lab38;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CallStack {
    public static void main(String[] args) {
        employee("emp.txt");
        manager("mgr.txt");
    }
    
    public static void employee(String fName) {
        createFile(fName);
    }
    
    public static void manager(String fName) {
        createFile(fName);
    }
    
    public static void createFile(String fName) {
        File file = new File("src/lab38abc/" + fName);
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
