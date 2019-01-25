package lab11;

public class Casting {
    public static void main(String[] args) {
        int x = 100;
        String s = "";
        //s = (String)x;
        s = x + "";
        s = String.valueOf(x);
        
        System.out.println(x);
        System.out.println(s);
        
        
    }
}
