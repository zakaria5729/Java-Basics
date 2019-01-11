package oopbasic1.polymorphism;

public class Triangle extends Shape {
    
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    void area() {
        System.out.println("Triangle = " + (0.5*dim1*dim2));
    }
}
