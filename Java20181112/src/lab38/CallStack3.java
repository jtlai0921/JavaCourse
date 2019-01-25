package lab38;

import java.util.Random;

public class CallStack3 {
    public static void main(String[] args) {
        try {
            int score = getScore();
            System.out.println("此次成績=" + score + ", 拍拍手");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("去補習...");
        }
    }
    
    public static int getScore() throws Exception {
        int score = new Random().nextInt(101);
        if(score >= 60) {
            return score;
        } else {
            Exception e = new Exception("此次成績不及格, 成績=" + score);
            throw e;
        }
    }
}
