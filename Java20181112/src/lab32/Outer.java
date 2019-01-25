package lab32;

public class Outer {
    public void play() {
        int version = 2;
        class Game {
            String name = "LoL";
            void printName() {
                System.out.println(name + " " + version);
            }
        }
        Game game = new Game();
        game.printName();
    }
}
