package classes;

import abstracts.AbstractClass;

class OtherCLass extends AbstractClass {
    @Override
    public void myMethod4(int l) {
        super.myMethod4(l);
        System.out.println("myMethod4 " + l);
    }

    @Override
    public void myMethod5(int m) {
        super.myMethod5(m);
        System.out.println("myMethod5 " + m);
    }

    @Override
    public void myMethod6(int n) {
        super.myMethod6(n);
        System.out.println("myMethod6 " + n);
    }

    @Override
    public void yourMethod3(int z) {
        super.yourMethod3(z);
        System.out.println("yourMethod3 " + z);
    }
}
