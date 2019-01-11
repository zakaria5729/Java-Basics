package oopbasic;

public class callByReferenceTest {

    public static void main(String[] b) {
        callByReference obj1 = new callByReference();
        obj1.name = "zakaria";
        System.out.println("Before calling: " + obj1.name);

        obj1.change(obj1);
        System.out.println("Before calling: " + obj1.name);
        
    }
}
