package com;

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "John";
        e1.salary = 30000;
        e1.addr = "台北市";
        
        Employee e2 = new Employee();
        e2.name = "Mary";
        e2.salary = 50000;
        //e2.addr = "桃園市";
        
        System.out.println(e1.name);
        System.out.println(e1.salary);
        System.out.println(e1.addr);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        System.out.println(e2.addr);
    }
}
