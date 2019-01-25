package lab18;

public class Son extends Father {
    public Son() {
        this(4);
        System.out.println("Son()...");
    }
    
    public Son(int x) {
        super(x);
        System.out.println("Son(int x)...");
    }
    
}
