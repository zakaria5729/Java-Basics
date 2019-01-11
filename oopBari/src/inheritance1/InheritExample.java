package inheritance1;

public class InheritExample {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.pi = 2;
        p.pj = 7;
        System.out.println("contents of parent class");

        p.showpp();
        System.out.println();

        c.pi = 18;
        c.pj = 29;
        c.pk = 21;
        System.out.println("contents of child class");

        c.showpk();
        c.showpp();
        System.out.println();
        System.out.println("sum of pi, pj, pk in child");
        c.sum();
    }
}
