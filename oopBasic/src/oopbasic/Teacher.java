package oopbasic;

public class Teacher {
    String name;
    int age, phone;
    
    void teacherMethod(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    void displayMethod() {
        System.out.println(name + " " + age + " " + phone);
    }
    
}
