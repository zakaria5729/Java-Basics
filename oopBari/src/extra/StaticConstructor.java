
package extra;

public class StaticConstructor extends Another {

    void method() {
        System.out.println("sub in method");
    }
    
    public static void main(String[] args) {
        StaticConstructor st = new StaticConstructor();
        st.method();
    }
}

//class Extra {
//    
//    static Extra() {  /*constructor can not be static*/
//        System.out.println("another");
//    }
//}

class Another {
    
    Another() {
        System.out.println("super");
    }
}
