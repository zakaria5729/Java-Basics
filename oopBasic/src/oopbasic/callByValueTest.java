package oopbasic;

public class callByValueTest {

    public static void main(String[] args) {
        
        callByValue obj = new callByValue();
        int x = 10;
        System.out.println("Before change x = " + x);

        obj.change(x);
        System.out.println("After change x = " + x);
    }
}
