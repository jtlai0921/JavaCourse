package lab13;

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Tom";
        e1.salary = 135000;
        String e1_level = e1.getLevel();
        
        Employee e2 = new Employee();
        e2.name = "Mary";
        e2.salary = 40000;
        String e2_level = e2.getLevel();
        
        System.out.printf("%s 的職等是 %s\n", e1.name, e1_level);
        System.out.printf("%s 的職等是 %s\n", e2.name, e2_level);
        
        
    }
}
