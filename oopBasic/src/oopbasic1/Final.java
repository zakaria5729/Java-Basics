package oopbasic1;

public class Final {
    
    public final int TAKA = 32;
    public final int DOLLER; //blank final variable
    public static final int MONEY; //black static final variable
    
    Final(int d){
        DOLLER = d;
    }
    
    static {
        MONEY = 435;
    }
    
    void dis() {
        System.out.println("DOLLER = " + DOLLER);
        System.out.println("MONEY = " + MONEY);
        System.out.println("TAKA = " + TAKA);
    }
}
