package covariantReturn;

class SuperA {
    int x = 1;
}

class SubB extends SuperA {
    int y = 2;
}

class Base {
    
    SuperA getObject() {
        System.out.println("Base");
        return new SuperA();
    }
}

public class CovariantReturn extends Base {
    @Override
    SuperA getObject() {
        System.out.println("CovariantReturn");
        return new SubB();
    }
    
    public static void main(String[] args) {
        Base test = new CovariantReturn();
        System.out.println(test.getObject() instanceof SubB);
        System.out.println(test.getObject().x);
    }
}
