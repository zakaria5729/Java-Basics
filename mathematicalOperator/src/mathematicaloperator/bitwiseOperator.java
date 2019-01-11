package mathematicaloperator;

public class bitwiseOperator {
    public static void main(String[] args) {
        int a = 32, b = 12, c;
        
        /*and operator*/
        c = a & b;
        System.out.println("a&b = " + c);
        
        /*or operator*/
        c = a | b;
        System.out.println("a|b = " + c);
        
        /*exor operator*/
        c = a ^ b;
        System.out.println("a^b = " + c);
        
        /*right operator*/
        c = a >> b;
        System.out.println("a>>b = " + c);
        
        /*left operator*/
        c = a << b;
        System.out.println("a<<b = " + c);
    }
}
