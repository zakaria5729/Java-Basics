package mathematicaloperator;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = src.nextInt();
        
        System.out.println("Enter another number: ");
        int b = src.nextInt();
        
        
        int res = a + b;
        System.out.println("The result is: " + res);
    }
}
