package oopbasic;

public class overloadingMethodMain {
    public static void main(String[] args) {
        
        overloadingMethod over = new overloadingMethod();
        over.overloadingMethod();
        over.overloadingMethod("zakaria", 22);
        over.overloadingMethod("zakaira", "hossain", 22);
        
        System.out.println(over.Multiply(5));
    }
    
}
