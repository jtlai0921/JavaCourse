package lab26;

public class Main {
    public static void main(String[] args) {
//        Chihuahua chihuahua = new Chihuahua();
//        Shiba shiba = new Shiba();
//        chihuahua.eat();
//        chihuahua.play();
//        shiba.eat();
//        shiba.play();
//        System.out.println(Chihuahua.legs);
//        System.out.println(Shiba.legs);
        
        IDog chihuahua2 = new Chihuahua();
        IDog shiba2 = new Shiba();
        print(chihuahua2);
        print(shiba2);
        
//        IPower shibaPower = new Shiba();
//        System.out.println(shibaPower.getValue());
        System.out.println(chihuahua2.getValue());
        System.out.println(shiba2.getValue());
        
    }
    
    public static void print(IDog dog) {
        dog.eat();
        dog.play();
        System.out.println(IDog.legs);
    }
}
