package lab40;

public class MyData {

    public MyData() {
        String who = Thread.currentThread().getName();
        System.out.println(who + " 執行 MyData() 建構子");
    }
    
    public static void main(String[] args) {
        String who = Thread.currentThread().getName();
        System.out.println(who + " 執行 main() 方法");
        MyData myData = new MyData();
        System.out.println(Runtime.getRuntime().freeMemory());
        // ...
        myData = null;
        System.gc();
        System.out.println(Runtime.getRuntime().freeMemory());
        // ...
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        String who = Thread.currentThread().getName();
        System.out.println(who + " 執行 finalize() 解構子");
    }
    
    
    
}
