package oopbasic1;

public class ToString {
    
    String name;
    int age;
    
    ToString(String n, int a) {
        name = n;
        age = a;
    }
    
    @Override
    public String toString() {
        //return "name: " + name + " age: " + age;
        return name +" "+ age;
    }
}
