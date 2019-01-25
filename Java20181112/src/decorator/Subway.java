package decorator;

public class Subway {
    public static void main(String[] args) {
        
        Food food = new Bread();
        food = new Ham(food);
        food = new Lettuce(food);
        food = new Olives(food);
        food = new Onion(food);
        food = new Onion(food);
        food = new Onion(food);
        food = new Onion(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Tomato(food);
        food = new Tuna(food);
        food = new Tuna(food);
        food = new Tuna(food);
        food = new Tuna(food);
        food = new Tuna(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        
        System.out.println(checkout(food));
        
    }
    
    // 結帳
    public static String checkout(Food food) {
        return "商品" + food.getName() + "\n價格:" + food.getPrice();
    }
}
