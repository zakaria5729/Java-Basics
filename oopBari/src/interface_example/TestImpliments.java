package interface_example;

public class TestImpliments implements testA, testB {

    public static void main(String[] args) {
        TestImpliments test = new TestImpliments();
        test.print();
    }
    
    @Override
    public void print() {  //this print method can not create ambiguity problem because
        System.out.println("printing...");
        System.out.println(x);
    }
}

/**
*but if this class is abstract then
*no need to override an interface mandatory class method
*and can't create an object of abstract class.
*/