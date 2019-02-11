package lab08;

public class StringDemo6 {
    public static void main(String[] args) {
        String s = " Hello World ";
        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        s = s.trim();
        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        
        String s2 = "i love live";
        int index = s2.indexOf("love");
        System.out.println(index);        
    }
}
