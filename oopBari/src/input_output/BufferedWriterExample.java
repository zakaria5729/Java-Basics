package input_output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try {
            String str1 = "This is the first content";
            String str2 = "This is the second content";

            File file = new File("e:/newfile.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            /**
             *true means add without remove previous content of file
             *false means remove previous content then add new content
             */
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write(str1);
            bw.newLine();
            bw.write(str2);
            bw.newLine();
            bw.close();
            
            System.out.println("File write successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
