package oopbasic1;

public class Car extends Vehicle{
    
    int price;
    
    Car(String c, double d, int p) {
        super(c, d);
        price = p;
    }
    
    @Override
    void attribute() {
        super.attribute();
        super.cl = "green";
        super.wt = 500;
      
        System.out.println("price = " + price);
        System.out.println("cl = " + cl);
        System.out.println("wt = " + wt);
    }
}
