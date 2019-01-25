package lab27;

public class Chihuahua extends ADog {

    @Override
    public void play() {
        System.out.println("球");
    }

    @Override
    public double getValue() {
        return 0.01;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    
}
