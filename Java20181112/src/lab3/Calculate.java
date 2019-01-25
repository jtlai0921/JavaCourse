package lab3;

public class Calculate {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.h = 100;
        r1.w = 10;
        r1.area = r1.h * r1.w;
        
        Triangle t1 = new Triangle();
        t1.h = 100;
        t1.w = 10;
        t1.area = (t1.h * t1.w)/2;
        
        System.out.println(r1.area);
        System.out.println(t1.area);
        
    }
}
