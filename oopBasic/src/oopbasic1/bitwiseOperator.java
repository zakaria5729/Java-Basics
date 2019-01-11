package oopbasic1;

public class bitwiseOperator {
    
    public static void main(String[] args) {
        int a = 65;     /*65 = 1000001*/
        int b = 13;     /*13 =    1101*/
        int c = 0;
        
        System.out.println("a = "+ Integer.toBinaryString(a) + " & b = " +Integer.toBinaryString(b));
        
        c = a & b;
        System.out.println("a & b = " +c+ " binary = "+Integer.toBinaryString(c));
        
        c = a | b;
        System.out.println("a | b = " +c+ " binary = "+Integer.toBinaryString(c));
        
        /*Exor*/
        c = a ^ b;
        System.out.println("a ^ b = " +c+ " binary = "+Integer.toBinaryString(c));
        
        /*NOT*/
        c = ~a;
        System.out.println("~a = " +c+ " binary = "+Integer.toBinaryString(c));
        
        /*left shitft*/
        c = a << 2;
        System.out.println("a >> 2 = " +c+ " binary = "+Integer.toBinaryString(c));
        
        /*right shitft*/
        c = a >> 2;
        System.out.println("a << 2 = " +c+ " binary = "+Integer.toBinaryString(c));
        
        /*zero fill right shitft. use for negative shift*/
        c = a >>> 2;
        System.out.println("a >>> 2 = " +c+ " binary = "+Integer.toBinaryString(c));
        
        
    
    }
}
