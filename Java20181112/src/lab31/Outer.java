package lab31;

public class Outer {
    int x = 777; // Outer's 物件變數
    static int sx = 9; // Outer's 類別變數
    public class Inner {
        int x = 77; // Inner's 物件變數
        //static int sx = 9; // 不可放類別成員
        public void callMe() {
            int x = 7; // 區域變數
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
            System.out.println(Outer.sx);
        }
    }
    
}
