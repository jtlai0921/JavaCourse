package decorator;

public class Egg extends SideDish {
    
    public Egg(Food food) {
        super(food);
        name = "雞蛋";
        price = 5;
    }
    
}
