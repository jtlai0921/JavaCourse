package lab33;

interface Calc2 {
    void add(int x, int y);
}

public class Test2 {
    public static void main(String[] args) {
        Calc2 calc2 = new Calc2(){
            public void add(int x, int y) {
                System.out.printf("%d + %d = %d\n", x, y, (x+y));
            }
        };
        calc2.add(10, 20);
        
        Calc2 calc2_1 = new Calc2() {
            @Override
            public void add(int x, int y) {
                System.out.printf("%d\n", (x+y));
            }
        };
        calc2_1.add(10, 20);
        
    }
}
