package lab34;

interface Calc {
    void add(int x, int y);
}

public class Test {
    public static void main(String[] args) {
        Calc calc = (x, y) -> System.out.printf("%d + %d = %d\n", x, y, (x+y)) ;
        calc.add(10, 20);
        
        calc((x, y) -> System.out.println(x*y));
        calc((x, y) -> System.out.println(x/y));
        calc((x, y) -> System.out.println(x+y));
        calc((x, y) -> System.out.println(x-y));
        
        Calc c = (x, y) -> System.out.println(x*y);
        calc(c);
    }
    
    private static void calc(Calc c) {
        c.add(20, 30);
    }
}
