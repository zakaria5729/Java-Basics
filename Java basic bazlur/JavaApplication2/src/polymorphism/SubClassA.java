package polymorphism;

public class SubClassA extends SuperClass {
    
    String value;

    public SubClassA(String value) {
        super();
        this.value = value;
    }
    
    public void hello() {
            System.out.println(value);
    }

}
