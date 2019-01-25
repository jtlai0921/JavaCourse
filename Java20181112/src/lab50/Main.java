package lab50;

public class Main {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        
        Thread master = new Thread(new Master(cookies), "master");
        Thread dog = new Thread(new Dog(cookies), "dog");
        
        dog.start();
        master.start();
        
    }
}
