package lab24;

import com.sun.corba.se.impl.copyobject.ORBStreamObjectCopierImpl;
import java.util.Random;

public class Showtime {
    public void play(Animal animal) {
        animal.move();
    }
    
    public Animal getAnimal() {
        int x = new Random().nextInt(3);
        Animal animal = null;
        switch(x) {
            case 0:
                animal = new Bird();
                break;
            case 1:
                animal = new Ostrich();
                break;    
            default:
                animal = new Tiger();
        }
        return animal;
    }
    
}
