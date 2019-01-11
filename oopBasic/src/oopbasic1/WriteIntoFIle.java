package oopbasic1;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFIle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = input.nextLine();

        try {
            File file = new File("C:/Users/Zakaria/Desktop/mt.txt");
            FileWriter w = new FileWriter(file);
            
            w.write(str);
            w.close();
            System.out.println("File write successfully");
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
