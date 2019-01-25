package lab24;

public class Zoo {
    public static void main(String[] args) {
        Showtime showtime = new Showtime();
        /*
        Bird bird = new Bird();
        Tiger tiger = new Tiger();
        Ostrich ostrich = new Ostrich();
        
        showtime.play(bird);
        showtime.play(tiger);
        showtime.play(ostrich);
        
        Animal animal = showtime.getAnimal();
        System.out.println(animal.getClass());
        animal.move();
        */
        // 轉型
        Animal animal2 = new Ostrich();
        animal2.move();
        ((Animal)animal2).move();
        ((Bird)animal2).move();
        ((Bird)animal2).eat();
        ((Ostrich)animal2).move();
        ((Ostrich)animal2).eat();
        ((Ostrich)animal2).spirit();
        
        if(animal2 instanceof Tiger) {
            ((Tiger)animal2).move();
        } else {
            System.out.println("不可轉");
        }
    }
}
