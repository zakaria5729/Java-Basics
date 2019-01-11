package oopbasic1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFIle {
    
    public static void main(String[] args) {
        
        try {
            File file = new File("C:/Users/Zakaria/Desktop/has.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNext()) {
                System.out.println(input.next());
            }
            input.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
