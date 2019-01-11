package oopbasic1.polymorphism;

public class PersonTest {

    public static void main(String[] args) {

        //runtime method overloading
        Person p;  //superclass reffernce can be create other class's object
        p = new Person();
        p.dis();
        p = new Teacher();
        p.dis();
        p = new Student();
        p.dis();
        System.out.println();

        //we can use an class type array here
        Person[] q = new Person[3];
        q[0] = new Person();
        q[1] = new Teacher();
        q[2] = new Student();

        for (int i = 0; i < 3; i++) {
            System.out.println(q[i].dis());
        }
    }
}
