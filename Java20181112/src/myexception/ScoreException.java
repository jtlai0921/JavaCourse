package myexception;

public class ScoreException extends Exception {

    public ScoreException(String message) {
        super(message);
    }
    
    public void 怎麼辦() {
        System.out.println("1.去補習");
        System.out.println("2.Good boy");
    }
    
    public void 誰教的() {
        System.out.println("John");
    }
}
