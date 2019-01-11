package oopbasic;

public class Teacher1 {
    String name;
    int age, phone;

    Teacher1(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    void displayMethod() {
        System.out.println(name + " " + age + " " + phone);
    }
}
