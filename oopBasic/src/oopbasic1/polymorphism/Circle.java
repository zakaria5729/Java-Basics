package oopbasic1.polymorphism;

public class Circle extends Shape {

    double r;

    /*This is not smart way*/
//     Circle(double dim1, double dim2, double r) {
//        super(dim1, dim2);
//        this.r = r;
//    }
//    
//    @Override
//    void area() {
//        System.out.println("Circle = " + (Math.PI * r * r));
//    }
    Circle(double r) {
        super(r, r);
    }

    @Override
    void area() {
        System.out.printf("Circle = %.2f\n", (Math.PI * dim1 * dim2));
    }
}
