package polymorphism;

public class SuperClass{
    
    public static void main(String[] args) {
        SuperClass obj1 = new SubClassA("hello");
//        obj1.value; //not possible
        
        SubClassA obj2 = new SubClassA("hello java");
        obj2.hello();
    }
}
