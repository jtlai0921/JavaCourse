package lab48;

public class Main {
    public static void main(String[] args) {
        
        Callback callback = new Callback() {
            @Override
            public void putNum(int num) {
                System.out.println("我得到了 : " + num);
            }
        };
        
        System.out.println("親愛的給我一個號碼");
        LuckyNumber luckyNumber = new LuckyNumber(callback);
        luckyNumber.start();
        
        
        System.out.println("我等待中...");
    }
}
