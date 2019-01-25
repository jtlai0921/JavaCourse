package lab27;

public interface IDog extends IPower {
    int legs = 4;
    void eat();
    void play();
    
    default void readMe() {
        System.out.println("我是一個 IDog 的介面");
    }
    
    public static void copyRight() {
        System.out.println("版權是 XXX");
    }
}
