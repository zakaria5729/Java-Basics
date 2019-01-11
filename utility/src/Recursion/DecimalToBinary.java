package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int num = input.nextInt();
        
        decToBin(num);
        System.out.println();
    }

    public static void decToBin(int n) {
        if (n > 0) {
            decToBin(n / 2);
            System.out.printf("%d", n % 2);
        }
    }
}
