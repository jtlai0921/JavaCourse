package lab33;

interface Calc {
    void add(int x, int y);
}

class ClacImpl implements Calc {
    @Override
    public void add(int x, int y) {
        System.out.printf("%d + %d = %d\n", x, y, (x+y));
    }
}

class ClacImpl_1 implements Calc {
    @Override
    public void add(int x, int y) {
        System.out.printf("%d\n", (x+y));
    }
}

public class Test {
    public static void main(String[] args) {
        Calc calc = new ClacImpl();
        calc.add(10, 20);
        
        Calc calc_1 = new ClacImpl_1();
        calc_1.add(10, 20);
        
    }
}
