package lab61;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exam_3 {
    public static void main(String[] args) throws IOException {
        String fn = "src/lab61/files/exam_3.txt";
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader (new FileReader(fn))) { // line n1
            if(br.ready()) {
                br.lines().forEach(c -> System.out.println(c));
                brCopy = br; // line n2
            }
        }
        //brCopy.ready(); //line n3;
    }
}
