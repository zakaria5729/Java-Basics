package oopbasic;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 5 for your turn: ");
            int num = input.nextByte();

            if (num == 5) {
                Random random = new Random();
                int rand = random.nextInt(7);
                System.out.println("Your point: " + rand);
            }
            else if (num == 0) {
                break;
            }
        }
    }
}
