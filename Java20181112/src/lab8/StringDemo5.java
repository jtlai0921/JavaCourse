package lab8;

public class StringDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        System.out.println("sb = " + sb);
        System.out.println("s = " + s);
        System.out.println("sb.length() = " + sb.length());
        System.out.println("s.length() = " + s.length());
        if(sb.equals("s")) {
            System.out.println("A");
        } else if(sb.toString().equals(s.toString())) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        
    }
}
