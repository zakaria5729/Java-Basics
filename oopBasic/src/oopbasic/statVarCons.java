package oopbasic;

public class statVarCons {
    
    String name;
    int age; 
    static String uniName = "DIU";
    
    statVarCons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println(name + " " + age + " " + uniName);
    }
    
}
