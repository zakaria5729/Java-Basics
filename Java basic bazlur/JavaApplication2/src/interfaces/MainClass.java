package interfaces;

public class MainClass implements MyInterface{
    
    static MyInterface myInterface;
    static String myWord;
    

    @Override
    public void helloInterface(String word) {
        myWord = word;
    }
    
    public static void main(String[] args) {
        myInterface = new MainClass();
        
        myInterface.helloInterface("Hello world");
        
        System.out.println(myWord);
    }

}
