package lab61;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Exam_1 {
    public static void main(String[] args) {
        String fn = "src/lab61/files/exam_1.txt";

        int i;
        char c;
        try (FileInputStream fis = new FileInputStream(fn);
             InputStreamReader isr = new InputStreamReader(fis)) {
            while (isr.ready()) { // line n1
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
