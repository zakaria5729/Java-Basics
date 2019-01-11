package files;

import java.io.File;

public abstract class FileFilter implements java.io.FileFilter{
    public static void main(String[] args) {
        
        File home = new File("D:\\Photos\\101");
        
        FileFilter pngFiler = new FileFilter() {
            
            @Override
            public boolean accept(File pathName) {
                String fileName = pathName.getName();
                return fileName.endsWith(".png");
            }
        };
        
        File[] fileLists = home.listFiles(pngFiler);
        for (File fileList : fileLists) {
            System.out.println(fileList.getName());
        }
    }   
}
