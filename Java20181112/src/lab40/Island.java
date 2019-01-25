package lab40;

public class Island {
    Island i;
    String name;

    public Island(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        Island i2 = new Island("台灣");
        Island i3 = new Island("格陵蘭");
        Island i4 = new Island("太平島");
        i2.i = i3;
        i3.i = i4;
        i4.i = i2;
        
        System.out.println(i2.i.i.i.name);
    }
}
