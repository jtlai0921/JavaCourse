package lab23;

class Calc2 {
    int add(int... values) {
        int sum = 0;
        for(int x : values) {
            sum += x;
        }
        return sum;
    }
    int add(float x, float y) {
        return (int)(x * y);
    }
    int add(double x, double y) {
        return (int)(x / y);
    }
}

public class Vararg2 {
    public static void main(String[] args) {
        Calc2 calc2 = new Calc2();
        System.out.println(calc2.add(20, 10));
    }
}
