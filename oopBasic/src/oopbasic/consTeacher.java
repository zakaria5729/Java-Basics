package oopbasic;

public class consTeacher {
    String name, gender;
    int age;
    
    consTeacher() {
        System.out.println("empty constructor");
    }
    
    consTeacher(String n, String g) {
        name = n;
        gender = g;
    }
    
    consTeacher(String n, String g, int a) {
        name = n;
        gender = g;
        age = a;
    }
    
    void displayInfo(){
        System.out.println(name + " " + gender + " " + age);
    }
}
