package mathematicaloperator;

import java.util.Scanner;

public class vowelConsonantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char ch;
        System.out.println("Enter a character");
        ch = scanner.next().charAt(0);
        
        switch (ch) {
            case 'a':
                System.out.println("this is vowel");
                break;
            case 'e':
                System.out.println("this is vowel");
                break;
            case 'i':
                System.out.println("this is vowel");
                break;
            case 'o':
                System.out.println("this is vowel");
                break;
            case 'u':
                System.out.println("this is vowel");
                break;
            default:
                System.out.println("this is consonant");
                break;
        }
    }
}
