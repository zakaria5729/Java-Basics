/**
 *Two types of nested class
 *   1. non-static nested class (inner class)
 *       a)Member inner class
 *       b)Anonymous inner class
 *        c)Local inner class
 *   2. static nested class
 */
package NestedClass;

public class TestOuter1 {

    private int data = 20;

    class Inner { //member inner class

        void msg() {
            System.out.println("data is:  = " + data);
            //display();
        }
    }

    void display() {
        System.out.println("Outer display");

        Inner in1 = new Inner();
        //TestOuter1.Inner in = new TestOuter1.Inner();
        in1.msg();
    }

    public static void main(String[] args) {
        TestOuter1 test = new TestOuter1();
        test.display();
    }
}
