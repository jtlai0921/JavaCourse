package login.dao;

import java.util.ArrayList;

public class UserDB {
    private static UserDB instance = new UserDB();
    private static ArrayList<String[]> users = new ArrayList<>();
    
    static {
        users.add(new String[]{"john", "1111"});
        users.add(new String[]{"mary", "2222"});
        users.add(new String[]{"tom", "3333"});
    }
    
    private UserDB() {
        System.out.println("UserDB()");
    }
    
    public static UserDB getInstance() {
        return instance;
    }
    
    public ArrayList<String[]> getUsers() {
        return users;
    }
    
    public int getUserSize() {
        return users.size();
    }
}
