package oopbasic1;

public class passByCurrentObjectAndAmbiguity {
    //instance var
    int x;
    String y;
    
    public passByCurrentObjectAndAmbiguity() {
        
    }
    
    public passByCurrentObjectAndAmbiguity(int x, String y) {
        this.x = x;
        this.y = y;
    }
    
    void doYY() {
        recRef rec = new recRef();
        rec.doXX(this);
    }
    
    void sum(int x, int y) {
        System.out.println(x+y);
    }
}

class recRef {
    
    public static void main(String[] args) {
        passByCurrentObjectAndAmbiguity pass = new passByCurrentObjectAndAmbiguity();
        pass.doYY();
    }
    
    void doXX(passByCurrentObjectAndAmbiguity obj) {
        obj.sum(5, 1);
    }
}