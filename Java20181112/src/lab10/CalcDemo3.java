package lab10;

public class CalcDemo3 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        b = a++ + ++a - a++;
        
        System.out.println(a);
        System.out.println(b);
    }
}
