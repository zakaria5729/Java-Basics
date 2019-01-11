package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFiles {

    public static void main(String[] args) {
        String currentFilePath = "C:\\Users\\zakar\\Desktop\\files";
        File file = new File(currentFilePath + File.separator + "hello.txt");

        if (file.exists()) {
            System.out.println("file exists");
            String filePath = file.getAbsolutePath();

            try {
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(filePath);
                    fileWriter.write(System.getProperty("line.separator"));
                    fileWriter.append("lol");

                    fileWriter.flush();
                    fileWriter.close();
                    System.out.println("file written.");
                }
            } catch (IOException ex) {
                Logger.getLogger(MyFiles.class.getName()).log(Level.SEVERE, null, ex);
            }

            try (FileReader fileReader = new FileReader(file)) {
                int i;
                String line = "";
                while ((i = fileReader.read()) != -1) {
                    line += (char) i;
                }

                System.out.println(line);

                line = "";
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    line += scanner.nextLine();
                }
                System.out.println(line);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Is it file: " + file.isFile());          
            System.out.println("Is it directory: " + file.isDirectory());

            File dir = new File("C:\\Users\\zakar\\Desktop\\files");
            System.out.println("Is it file: " + dir.isFile());
            System.out.println("Is it directory: " + dir.isDirectory());

            System.out.println("Current working directory: " + System.getProperty("user.dir"));
            
//            File oldFileName = new File("hello.txt");
//            File newFileName = new File("world.txt");
//            if(oldFileName.renameTo(newFileName)) {
//                System.out.println("file name changed");
//            } else {
//                System.out.println("file name not changed");
//            }
            

            File newDir = new File("C:\\Users\\zakar\\Desktop\\files\\myDir");
            if (newDir.mkdir()) {
                System.out.println("New directory created.");
                File newFile = new File(newDir.getPath() + File.separator + "my.txt");

                if (!newFile.exists()) {
                    try {
                        newFile.createNewFile();
                        System.out.println("new file created");
                    } catch (IOException ex) {
                        Logger.getLogger(MyFiles.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                System.out.println("new file path: " + newFile.getAbsolutePath());
                System.out.println("new file path: " + newFile.getPath());
            }
            
            System.out.println();
            File dirPath = new File("C:\\Users\\zakar\\Desktop\\files");
            File[] fileList = dirPath.listFiles();
            for (File lists : fileList) {
                System.out.println(lists.getName());
            }
            
            
        } else {
            System.out.println("File does not exists, lets create one.\n");

            try {
                boolean isCreated = file.createNewFile();

                if (isCreated) {
                    System.out.println("File created successfully");
                } else {
                    System.out.println("File not created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
