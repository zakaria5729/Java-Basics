package Compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Try {

     static String s;
    
    public static void main(String[] args) {
        
        try {
            Scanner input = new Scanner(new File("C:\\Users\\Zakaria\\Desktop\\two.txt"));

            while (input.hasNext()) {
                s = input.nextLine();
            }
            
            System.out.println(s);
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        

    }
}
