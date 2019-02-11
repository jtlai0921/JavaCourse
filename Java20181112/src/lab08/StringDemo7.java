package lab08;

public class StringDemo7 {
    public static void main(String[] args) {
        String s = " Hello World ";
        System.out.println(s); 
        s = s.trim(); // s.trim();
        System.out.println(s); 
        int index = s.indexOf(" ");
        System.out.println(index);        
    }
}
