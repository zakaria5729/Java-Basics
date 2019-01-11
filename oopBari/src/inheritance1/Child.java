package inheritance1;

public class Child extends Parent {
    int pk;
    
    void showpk() {
        System.out.println("pk: " + pk);
    }
    
    void sum() {
        System.out.println("pi+pj+pk: " + (pi + pj + pk));
    }
}
