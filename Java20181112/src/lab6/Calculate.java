package lab6;
import lab4.Circle;

public class Calculate {
    public static void main(String[] args) {
        lab4.Circle c1 = new lab4.Circle();
        c1.r = 10;
        c1.calcArea();
        
        System.out.println(c1.area);
        
        Circle c2 = new Circle();
        c2.r = 9;
        c2.calcArea();
        
        System.out.println(c2.area);
        
        
    }
}
