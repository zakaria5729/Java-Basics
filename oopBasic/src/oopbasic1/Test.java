package oopbasic1;

public class Test {
    
    public static void main(String[] args) {
        Car car = new Car("white", 100, 400000);
        car.attribute();
        
        System.out.println();
        
        Vehicle vehicle = new Vehicle("blue", 200);
        vehicle.attribute();     
    }
}
