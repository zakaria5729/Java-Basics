package mathematicaloperator;

import java.util.Scanner;

public class arrayString {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[10];
        
        for (int i = 0; i < 5; i++) {
            names[i] = input.nextLine();
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}
