package lab30;

public class Monkey {
    public static void main(String[] args) {
        showTime(Week.MON);
        //showTime(1);
    }
    
    public static void showTime(Week week) {
        switch(week) {
            case MON:
                System.out.println("星期一猴子穿新衣");
                break;
            case TUES:
                System.out.println("星期二猴子肚子餓");
                break;
            case WED:
                System.out.println("星期三猴子去爬山");
                break;
        }
    }
}
