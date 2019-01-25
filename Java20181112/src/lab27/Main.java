package lab27;

public class Main {
    public static void main(String[] args) {
        Chihuahua chihuahua = new Chihuahua();
        print(chihuahua);
    }
    
    public static void print(ADog dog) {
        dog.eat();
        dog.play();
        System.out.println(IDog.legs);
        System.out.println(dog.getPrice());
                
    }
}
