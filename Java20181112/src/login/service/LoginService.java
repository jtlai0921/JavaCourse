package login.service;

import java.util.ArrayList;
import login.dao.UserDB;
import login.exception.AccountNotFoundException;
import login.exception.PasswordMismatchException;

public class LoginService {
    private UserDB userDB = UserDB.getInstance();
    
    public boolean input(String username, String password) throws AccountNotFoundException, PasswordMismatchException {

        ArrayList<String[]> users = userDB.getUsers();
        for (String[] user : users) {
            if (user[0].equals(username)) {
                if (user[1].equals(password)) {
                    return true;
                } else {
                    throw new PasswordMismatchException("密碼錯誤");
                }
            }
        }
        throw new AccountNotFoundException("無此帳號");
    }
    
    public int getUserAmount() {
        return userDB.getUserSize();
    }
    
    public int getUserAmount(int length) {
        int amount = 0;
        ArrayList<String[]> users = userDB.getUsers();
        for (String[] user : users) {
            if(user[0].length() == length) {
                ++amount;
            }
        }
        return amount;
    }
}
