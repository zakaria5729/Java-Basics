package Recursion;

import java.util.Scanner;

public class SumOfDigitOfANumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        
        System.out.println("sum: " + sumOfDigit(input.nextInt())); 
    }
    
    
    public static int sumOfDigit(int num) {
        int sum = 0;
        if(num == 0) {
            return 0;
        }
        else {
            return num%10 + sumOfDigit(num/10);
        }
    }
}
