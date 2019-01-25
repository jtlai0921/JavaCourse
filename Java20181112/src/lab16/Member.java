package lab16;

public class Member {
    int x = 100;
    static int y = 200;
    
    void play() {
        System.out.println(x);
        System.out.println(y);
        eat();
    }
    
    static void eat() {
        //System.out.println(x);
        System.out.println(y);
        //play();
    }
    
    static void eat2() {
        Member m = new Member();
        System.out.println(m.x);
        System.out.println(y);
        m.play();
    }
    
    
}
