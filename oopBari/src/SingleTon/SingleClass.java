package SingleTon;

public class SingleClass {

    private static SingleClass obj = null;
    
    private SingleClass() {
        /**private constructor only possible for singleTon pattern or class
        *where private constructor will prevent the instantiation of this class directly.
        */
    } 
    
    public static SingleClass getInstanceOfObject() {
        /**
        *this will ensure that no more than one object can be created at a time
        */
        if(obj == null) {
            obj = new SingleClass();
        }
        return obj;
    }
    
    public void display() {
        System.out.println("Singleton class works");
    }
}
