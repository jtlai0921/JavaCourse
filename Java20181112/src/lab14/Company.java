package lab14;

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Tom";
        e1.salary = 135000;
        e1.setLevel();
        
        Employee e2 = new Employee();
        e2.name = "Mary";
        e2.salary = 40000;
        e2.setLevel();
        
        System.out.printf("%s 的職等是 %s\n", e1.name, e1.level);
        System.out.printf("%s 的職等是 %s\n", e2.name, e2.level);
        
    }
}
