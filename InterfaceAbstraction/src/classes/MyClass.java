package classes;

import abstracts.AbstractClass;

class MyClass extends AbstractClass {

    @Override
    public void myMethod1(int i) {
        super.myMethod1(i);
        System.out.println("myMethod1 " + i);
    }

    @Override
    public void myMethod2(int j) {
        super.myMethod2(j);
        System.out.println("myMethod2 " + j);
    }

    @Override
    public void myMethod3(int k) {
        super.myMethod3(k);
        System.out.println("myMethod3 " + k);
    }

    @Override
    public void yourMethod1(int x) {
        super.yourMethod1(x);
        System.out.println("yourMethod1 " + x);
    }

    @Override
    public void yourMethod2(int y) {
        super.yourMethod2(y);
        System.out.println("yourMethod2 " + y);
    }
}
