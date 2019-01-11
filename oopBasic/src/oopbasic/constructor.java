package oopbasic;

import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name, age, phone: ");
        String name = input.nextLine();
        int age = input.nextInt();
        int phone = input.nextInt();

        Teacher1 teacher1 = new Teacher1(name, age, phone);
        teacher1.displayMethod();
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your name, age, phone: ");
        name = input1.nextLine();
        age = input1.nextInt();
        phone = input1.nextInt();
        
        Teacher1 teacher2 = new Teacher1(name, age, phone);
        teacher2.displayMethod();
    }
}
