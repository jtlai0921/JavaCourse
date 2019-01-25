package lab10;

public class PassByValue {
    public static void main(String[] args) {
        int[] socres = {100, 90};
        System.out.println(socres[0] + ", " + socres[1]);
        setScore(socres);
        System.out.println(socres[0] + ", " + socres[1]);
    }
    public static void setScore(int [] s) {
        s[0] = 80;
    }
}
