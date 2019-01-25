package lab19;

import lab18.*;

public class Father {
    public Father(int x) {
        System.out.println("Father..." + Math.sqrt(x));
    }
    public void play() {
        System.out.println("Golf : " + getClass());
    }
    public void eat() {
        System.out.println("Rice : " + getClass());
    }
}
