package lab39;

public class User {
    private String name;
    public User() {
        
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        User user1 = new User("Mary");
        User user2 = new User();
        user1 = user2;
        assert(user1.getName()!=null);
        System.out.println(user1.getName());
        System.out.println(user2.getName());
    }
    
}
