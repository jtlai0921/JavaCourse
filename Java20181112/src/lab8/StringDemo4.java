package lab8;

public class StringDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("This is a dog");
        sb.insert(10, "big ");
        System.out.println("capacity = " + sb.capacity());
        System.out.println("sb = " + sb);
    }
}
