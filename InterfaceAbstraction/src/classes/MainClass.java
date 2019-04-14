package classes;

public class MainClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod1(12);
        myClass.myMethod2(13);
        myClass.myMethod3(14);
        myClass.yourMethod1(1);
        myClass.yourMethod2(2);

        System.out.println();

        OtherCLass otherCLass = new OtherCLass();
        otherCLass.myMethod4(15);
        otherCLass.myMethod5(16);
        otherCLass.myMethod6(17);
        otherCLass.yourMethod3(3);
    }
}
