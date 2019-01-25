package login;

import java.util.ArrayList;
import java.util.Scanner;
import login.exception.AccountNotFoundException;
import login.exception.PasswordMismatchException;
import login.service.LoginService;

public class Login {

    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        int count = 3;
        while (count-- > 0) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("請輸入登入帳號:");
                String username = scanner.nextLine();
                System.out.println("請輸入登入密碼:");
                String password = scanner.nextLine();
                boolean check = loginService.input(username, password);
                System.out.println("login check : " + check);
                return;
            } catch (AccountNotFoundException | PasswordMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("超過登入次數");
    }

    

}
