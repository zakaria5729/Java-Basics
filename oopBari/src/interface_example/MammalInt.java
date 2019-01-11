package interface_example;

public class MammalInt implements Animal {

    MammalInt() {
       // x = 67;  //can not assing value because of final variable
    }

    public int noOfLegs() {
        return 10;
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        
        System.out.println(m.noOfLegs());
        System.out.println(x);
        //System.out.println(Animal.x);
    }

    @Override
    public void eat() {
        System.out.println("Eat method");
    }

    @Override
    public void travel() {
        System.out.println("Travel method");
    }
}
