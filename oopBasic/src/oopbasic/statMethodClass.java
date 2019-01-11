package oopbasic;

public class statMethodClass {
    
    int var1;
    static int var2;
    
    void display1() {
        var1 = 20;
        System.out.println("This is non static method " + var1);
    }
    
    static void display2() {
        var2 = 22;
        System.out.println("This is static method " + var2);
    }
    
}
