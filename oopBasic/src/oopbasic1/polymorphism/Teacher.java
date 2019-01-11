package oopbasic1.polymorphism;

public class Teacher extends Person {
    
    @Override
    int dis() {
        System.out.println("This is teacher class");
        return 20;
    }
}
