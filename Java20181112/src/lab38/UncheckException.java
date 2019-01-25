package lab38;

import java.util.Scanner;

public class UncheckException {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入分子:");
        int x = scanner.nextInt();
        System.out.println("請輸入分母:");
        int y = scanner.nextInt();
        try {
            int z = x / y;
            System.out.printf("%d / %d = %d\n", x, y, z);
        } catch(ArithmeticException e) {
            System.out.println("錯誤原因:" + e.getMessage());
        }
        
    }
}
