package mathematicaloperator;

import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        System.out.println("Enter a array length: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        String[] st = new String[n];
        
        System.out.println("Enter your string");
        for (int i = 0; i < n; i++) {
            st[i] = input.nextLine();
        }
        
        System.out.print("\nYour String element is: ");
        for(String str : st) {
            System.out.println(str);
        }
    }
}
