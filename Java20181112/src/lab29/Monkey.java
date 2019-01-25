package lab29;

public class Monkey {
    public static void main(String[] args) {
        showTime(201);
        showTime(Week.MON);
        showTime(1);
        showTime(2);
        showTime(3);
    }
    
    public static void showTime(int w) {
        switch(w) {
            case Week.MON:
                System.out.println("星期一猴子穿新衣");
                break;
            case Week.TUES:
                System.out.println("星期二猴子肚子餓");
                break;
            case Week.WED:
                System.out.println("星期三猴子去爬山");
                break;    
            default:
                System.out.println("Error");
        }
    }
}
