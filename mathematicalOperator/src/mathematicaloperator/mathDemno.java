package mathematicaloperator;

public class mathDemno {
    public static void main(String[] args) {
        int x = 2;
        int y = -3;
        int c;
        double r = 3.5;
        
        c = Math.max(x, y);
        System.out.println("max = "+c);
        
        c = Math.min(x, y);
        System.out.println("min = "+c);
        
        c = Math.abs(y);
        System.out.println("abs = "+c);
        
        double c1 = Math.pow(x, y);
        System.out.println("pow = "+c1);
        
        double c2 = Math.random();
        System.out.println("random = "+c2);
        
        c2 = Math.round(r);
        System.out.println("round = "+c2);
        
        /*using format specifier*/
        c2 = Math.PI;
        System.out.printf("PI = %.2f\n", c2);
        
        c2 = Math.E;
        System.out.printf("E = %.3f\n", c2);
    }
}
