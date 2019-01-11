package oopbasic1.polymorphism;

public class Student extends Teacher {
    
    @Override
    int dis() {
        System.out.println("This is student class");
        return 30;
    }
}
