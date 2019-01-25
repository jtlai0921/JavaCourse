package lab39;

import java.util.HashSet;
import java.util.Set;

public class Leetcode {
    public static void main(String[] args) {
        String s1 = "Loveyou";
        String s2 = "havefun";
        String s3 = "bigbidpig";
        test(s1);
        test(s2);
        test(s3);
    }
    
    public static void test(String s) {
        int count = 0;
        Set set = new HashSet(); // 不重複陣列
        // block of code
        for(int i=0;i<s.length();i++) {
            if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                count++;
                set.add(s.charAt(i));
            }
        }
        System.out.printf("%s 的重複值是 %s 共有 %d 組\n", s, set, set.size());
        
    }
}
