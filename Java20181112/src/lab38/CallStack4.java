package lab38;

import java.util.Random;
import myexception.ScoreException;

public class CallStack4 {
    public static void main(String[] args) {
        try {
            int score = getScore();
            System.out.println("此次成績=" + score + ", 拍拍手");
        } catch (ScoreException ex) {
            System.out.println(ex.getMessage());
            ex.怎麼辦();
            ex.誰教的();
        }
    }
    
    public static int getScore() throws ScoreException {
        int score = new Random().nextInt(101);
        if(score >= 60) {
            return score;
        } else {
            ScoreException e = new ScoreException("此次成績不及格, 成績=" + score);
            throw e;
        }
    }
}
