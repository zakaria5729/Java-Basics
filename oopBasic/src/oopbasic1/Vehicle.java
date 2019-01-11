package oopbasic1;

public class Vehicle {
    
    private String color;
    private double weight;
    
    public String cl;
    public double wt;
    
    Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    
    void attribute() {
        System.out.println("color = " + color);
        System.out.println("weight = " + weight);
    }
}
