package lab10;

public class PassByValue2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = new String("Java");
        append8(sb);
        //append8(s);
        s = add8(s);
        System.out.println("sb = " + sb);
        System.out.println("s = " + s);
    }
    
    public static void append8(StringBuilder sb2) {
        sb2.append("8");
    }
    
    public static void append8(String s2) {
        s2 += "8";
    }
    
    public static String add8(String s2) {
        s2 += "8";
        return s2;
    }
}
