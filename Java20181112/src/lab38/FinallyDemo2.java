package lab38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個數字");
        try {
            int x = scanner.nextInt();
            System.out.println("您輸入的是 : " + x);
        } finally {
            System.out.println("一定要執行我, 謝謝使用");
        }
        
    }
}
