package oopbasic;

public class staticTest {
    
    static {
        System.out.println("This text is printed on static block\n");
    }
    
    public static void main(String[] args) {
        staticBlock block = new staticBlock();
        block.display1();
        
        staticBlock.display2();       
    }
}
