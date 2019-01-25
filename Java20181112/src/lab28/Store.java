package lab28;

public class Store {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        //-------------------------------
        Book bo1 = new Book("Java", 300);
        Book bo2 = new Book("Java", 300);
        System.out.println(bo1.equals(bo2));
        System.out.println(bo1.hashCode());
        System.out.println(bo2.hashCode());
    }
}
