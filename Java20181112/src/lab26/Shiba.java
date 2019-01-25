package lab26;

public class Shiba implements IDog {

    @Override
    public void eat() {
        System.out.println("狗飼料");
    }

    @Override
    public void play() {
        System.out.println("飛盤");
    }

    @Override
    public double getValue() {
        return 0.05;
    }
    
}
