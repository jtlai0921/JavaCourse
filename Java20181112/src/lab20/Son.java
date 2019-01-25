package lab20;

public class Son extends Father {
    public void play() {
        System.out.println("LoL");
    }
    
    public void access() {
        this.play();
        super.play();
    }
    
}
