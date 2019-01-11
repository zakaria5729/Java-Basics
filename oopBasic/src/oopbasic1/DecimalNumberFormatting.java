package oopbasic1;

import java.text.DecimalFormat;

public class DecimalNumberFormatting {
    
    public static void main(String[] args) {
        
        double d = 10.232322;
        System.out.printf("%.2f\n", d); //c approach
        
        DecimalFormat dec = new DecimalFormat("0.00"); //java approach
        System.out.println(dec.format(d)); 
    }
}
