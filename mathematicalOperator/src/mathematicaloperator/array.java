package mathematicaloperator;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        System.out.println("Enter the array size: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int array[] = new int[n], sum = 0;
        
        /*array comment*/
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        
        /*array print*/
        System.out.println("Array elements printing: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
            /*System.out.printf("%d\n", array[i]);*/
        }
        
        /*array elements printing using for each loop*/
        System.out.println("Array elements printing by for each loop: ");
        for (int i : array) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("\nsum = " + sum);
    }
}
