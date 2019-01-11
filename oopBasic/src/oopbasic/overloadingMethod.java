package oopbasic;

public class overloadingMethod {
    void overloadingMethod(){
        System.out.println("Empty");
    }
    
    void overloadingMethod(String n, int a){
        System.out.println(n + " " + a);
    }
    
    void overloadingMethod(String n, String m, int a){
        System.out.println(n + " " + m + " " + a);
    }
    
    int Multiply(int n){
        return n*n;
    }
    
}
