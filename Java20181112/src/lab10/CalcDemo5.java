package lab10;

public class CalcDemo5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        
        if((a > 0) || (++b > 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("b=" + b);
        
    }
}
