package lab10;

public class WrapperClass2 {
    public static void main(String[] args) {
        int a = 100;
        Integer b = Integer.valueOf(100); // new Integer(100);
        
        System.out.println(a);
        System.out.println(b.intValue()); // Java 5 以前
        System.out.println(b); // Java 5 (含)以後, 編譯器會自動加上 b.intValue() --> auto-unboxing (自動拆箱)
        
        Integer c = 100; // Java 5 (含)以後, 編譯器會自動加上Integer.valueOf(100); --> auto-boxing (自動裝箱)
        
        a = 200;
        b = a; // 200 -> Integer.valueOf(200);
        
    }
}
