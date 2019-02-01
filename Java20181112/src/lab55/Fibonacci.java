package lab55;

public class Fibonacci {
    public long f(int n) {
        if(n<=1) return n;
        else return f(n-1) + f(n-2);
    }
}
