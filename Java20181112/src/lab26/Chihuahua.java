package lab26;

public class Chihuahua implements IDog {

    @Override
    public void eat() {
        System.out.println("狗飼料");
    }

    @Override
    public void play() {
        System.out.println("球");
    }

    @Override
    public double getValue() {
        return 0.01;
    }

    
}
