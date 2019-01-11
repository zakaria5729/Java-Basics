
package exception;

import java.io.EOFException;
import java.io.IOException;

public class ExceptionOverriden {

    void msg() {
        System.out.println("Parent1");
    }
    
    void some() throws IOException {
        System.out.println("Parent2");
    }
}

class Test extends ExceptionOverriden {
    
//    @Override
//    void msg() {  //we can throws or not
//        System.out.println("Child1");
//    }
    
//    @Override
//    void msg() throws ArithmeticException { //can be throws unchecked/runtime exception
//        System.out.println("Child1");
//    }
    
//    @Override
//    void msg() throws IOException {  //can not throws checked exception
//        System.out.println("Child1");
//    }
    
//    @Override
//     void some() { //we can throws or not
//        System.out.println("Child2");
//    }
    
//     @Override
//     void some() throws IOException { //can be throws similar checked exception of parent class
//        System.out.println("Child2");
//    }
    
//    @Override
//     void some() throws EOFException { //can be throws sub class exception of this super class exception
//        System.out.println("Child2");
//    }
    
//    @Override
//     void some() throws ArithmeticException { //can be throws unchecked/runtime exception also
//        System.out.println("Child2");
//    }
    
//    @Override
//     void some() throws Exception { //can not throws super class exception of this exception
//        System.out.println("Child2");
//    }
    
}
