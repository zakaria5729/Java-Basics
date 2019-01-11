package oopbasic1.polymorphism;

public class IntClass implements Interface2 {
    
    @Override
    public void area1() {
        System.out.print("Area of triangle: ");
    }

    @Override
    public void area2() {
        System.out.println(0.5*DIM1*DIM2);
    }
}
