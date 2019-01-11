package Recursion;

import java.util.Scanner;

public class PowerOfaNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base and exponent number");
        
        PowerDemo powerDemo = new PowerDemo();
        int result = powerDemo.pow(input.nextInt(), input.nextInt());
        System.out.println(result);
    }
}
