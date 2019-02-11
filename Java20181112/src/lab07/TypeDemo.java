package lab07;

public class TypeDemo {
    static int x;
    int y;
    public static void main(String[] args) {
        int z = 0; // 要有初始值
        int a;
        System.out.println(x);
        System.out.println(TypeDemo.x);
        
        TypeDemo td = new TypeDemo();
        System.out.println(td.y);
        
        System.out.println(z);
        
        a = 0;
        System.out.println(a);
    }
}
