package login;

import login.service.LoginService;

public class UserAmount {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        System.out.println(loginService.getUserAmount());
    }
}
