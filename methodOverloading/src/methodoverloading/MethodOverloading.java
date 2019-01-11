package methodoverloading;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter four integer numbers: ");
        int a1 = scn.nextInt();
        int b1 = scn.nextInt();
        int c1 = scn.nextInt();
        int d1 = scn.nextInt();
        
        System.out.println("Enter two float numbers: ");
        float f1 = scn.nextFloat();
        float f2 = scn.nextFloat();
        
        methodClass obj = new methodClass();
        
        int a2 = obj.performAddition(a1, b1);
        int b2 = obj.performAddition(a1, b1, c1, d1);
        int b3 = obj.performAddition(b1, a1, c1, d1);
        float c2 = obj.performAddition(f1, f2);
       
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(c2);
    }
}
