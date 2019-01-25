package lab36;

public class Outer1 {

    static int sx = 9;

    static class Inner1 {

        static void foo() {
            System.out.println(sx);
        }

        void bar() {
            System.out.println(sx);
            Inner1.foo();
        }
    }

    class Inner2 {

        void bar() {
            System.out.println(sx);
            System.out.println(x);
        }
    }
    int x = 7;
}
