package lab11;

public class Switch_Case {
    public static void main(String[] args) {
        int x = 0;
        switch(x) {
            default:
                x = 0;
            case 1:
                x++;
            case 2:
                x += 2;
                break;    
        }
        
        System.out.println(x);
        
        
    }
}
