package lab10;

public class WrapperClass {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        
        String chinese = "100";
        String math = "90";
        System.out.println(chinese + math);
        
        // String -> int
        int sum = Integer.parseInt(chinese) + Integer.parseInt(math);
        System.out.println(sum);
        
    }
}
