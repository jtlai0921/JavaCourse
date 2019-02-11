package lab04;


public class Calculate {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 10;
        c1.calcArea();
        
        Circle c2 = new Circle();
        c2.r = 10;
        c2.calcArea();
        
        System.out.println(c1.area);
        System.out.println(c2.area);
    }
}
