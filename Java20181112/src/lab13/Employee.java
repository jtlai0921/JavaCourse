package lab13;

public class Employee {
    String name;
    int salary;
    static String comName = "華華";
    
    String getLevel() {
        if(salary >=100000) {
            return "經理";
        } else if(salary >= 50000){
            return "副理";
        } else if(salary >= 40000){
            return "襄理";
        } else {
            return "辦事員";
        }
    }
    
}
