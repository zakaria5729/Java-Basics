package oopbasic1;

class FinalMethodEx extends FinalMethod{
    
    void dis2() {
        System.out.println("Final ov method");
    }
}

public class FinalMethodTest {
    
    public static void main(String[] args) {
        FinalMethodEx ob = new FinalMethodEx();
        ob.dis();
    }
}
