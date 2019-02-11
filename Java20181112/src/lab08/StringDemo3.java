package lab08;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "Java8";
        StringBuilder sb = new StringBuilder("Java");
        sb.append("8");
        
        System.out.println(s);
        System.out.println(sb);
        
        System.out.println(s.equals(sb.toString()));
        
    }
}
