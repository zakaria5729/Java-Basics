package oopbasic1.polymorphism;

public abstract class Shape {
    
    double dim1, dim2;
    
    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }
    
    abstract void area();
}
