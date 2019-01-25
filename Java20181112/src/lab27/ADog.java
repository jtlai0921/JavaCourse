package lab27;

public abstract class ADog implements IDog {
    
    @Override
    public void eat() {
        System.out.println("狗飼料");
    }
    
    public abstract int getPrice();
}
