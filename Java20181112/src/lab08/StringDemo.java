package lab08;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "jAvA";
        String s6 = "我喜歡 Java 咖啡";
        System.out.printf("s1 == s2 ? %b\n", (s1 == s2));
        System.out.printf("s3 == s4 ? %b\n", (s3 == s4));
        System.out.printf("s3 == s1 ? %b\n", (s3 == s1));
        System.out.printf("s1.equals(s2) ? %b\n", (s1.equals(s2)));
        System.out.printf("s3.equals(s4) ? %b\n", (s3.equals(s4)));
        System.out.printf("s3.equals(s1) ? %b\n", (s3.equals(s1)));
        System.out.printf("s4.equalsIgnoreCase(s5) ? %b\n", (s4.equalsIgnoreCase(s5)));     
        System.out.printf("s6.contains(s4) ? %b\n", (s6.contains(s4)));     
        
        s1 = s1.intern();
        System.out.printf("s3 == s1 ? %b\n", (s3 == s1));
    }
}
