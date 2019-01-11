package oopbasic1;

public class This {

    String name;
    String color;
    int age;

    This(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    This(String n, int a, String c) {
        this(n, a);
        color = c;
    }
    
    public void msg() {
        System.out.println("This is msg method");
    }

    public void display() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("color = " + color);
        this.msg();
        //msg();
    }
}
