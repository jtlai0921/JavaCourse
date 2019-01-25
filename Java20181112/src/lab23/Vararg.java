package lab23;

class Calc {
    int add(int... values) {
        int sum = 0;
        for(int x : values) {
            sum += x;
        }
        return sum;
    }
}

public class Vararg {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(calc.add(values));
        System.out.println(calc.add());
        System.out.println(calc.add(10));
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
    }
}
