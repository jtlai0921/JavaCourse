package lab15;

public class Company {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Tom", 135000);
        Employee e2 = new Employee("Mary", 40000);
        
        System.out.printf("%s 的職等是 %s\n", e1.name, e1.level);
        System.out.printf("%s 的職等是 %s\n", e2.name, e2.level);
        
    }
}
