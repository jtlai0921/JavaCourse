package army;

public class ArmyMain {
    
    public static void main(String[] args) {
        ArmyMain army = new ArmyMain();
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        
        army.move(fighter);
        army.fire(fighter);
        
        army.move(tank);
        army.fire(tank);
        
        army.move(truck);
        
    }
    
    public void fire(Weapon weapon) {
        weapon.shoot();
    }
    
    public void move(Car car) {
        car.move();
    }
    
    public void move(Airplane airplane) {
        airplane.move();
    }
    
    
}
