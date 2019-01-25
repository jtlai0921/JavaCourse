package lab38;

import java.util.Scanner;

public class UncheckException2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入分子:");
        int x = scanner.nextInt();
        System.out.println("請輸入分母:");
        int y = scanner.nextInt();
        if(y != 0) {
            int z = x / y;
            System.out.printf("%d / %d = %d\n", x, y, z);
        } else {
            System.out.println("分母不可=0");
        }
        
    }
}
