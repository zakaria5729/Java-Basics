package oopbasic1;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

    public static void main(String[] args) {

        /*Directory/folder create*/
        File dir = new File("C:/Users/Zakaria/Desktop/myfile/file/");

        // mkdir() Creates a directory called file, if and only if myfile exists. 
        if (dir.mkdir()) {
            System.out.println("File is created\n");
        } else {
            System.out.println("File is not created\n");
        }
        
        
        // Creates file inside myfile, if myfile exists. 
        // Else creates myfile first and then creates file inside it.
        if (dir.mkdirs()) {
            System.out.println("File is created\n");
        } else {
            System.out.println("File is not created\n");
        }
        
        System.out.println(dir.getAbsolutePath() + "\n");
        
        System.out.println(dir.getName() + "\n");
        
        if (dir.delete()) {
            System.out.println("Folder deleted\n");
        } else {
            System.out.println("Folder is not deleted\n");
        }
        
        String path = dir.getAbsolutePath();
        
        /*File create*/
        File f = new File(path + "textfile.apk");
        
        try {
            f.createNewFile();
            System.out.println("File created\n");
            
        } catch (IOException e) {
            System.out.println(e + "\n");
        }
        
        if (f.delete()) {
            System.out.println("File is deleted\n");
        } else {
            System.out.println("file is not deleted\n");
        }
        
        if (f.exists()) {
            System.out.println("file exists\n");
        } else {
            System.out.println("file is not exists\n");
        }
    }
}
