package input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        
        try {
            FileReader file = new FileReader("e:/newfile.txt");
            BufferedReader br = new BufferedReader(file);
            //BufferedReader br = new BufferedReader(new FileReader("e:/newfile.txt"));
            
            String sCurrLine;
            while ((sCurrLine = br.readLine()) != null) {
                System.out.println(sCurrLine);
            }
            br.close();
        } catch (IOException e) {
            //System.out.println(e);
            //System.err.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("...."); 
        }
    }
}
