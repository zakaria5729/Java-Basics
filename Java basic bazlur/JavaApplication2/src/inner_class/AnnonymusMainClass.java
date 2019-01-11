package inner_class;

class AnnonymusInnerClassExample {

    public String show() {
        return "calling";
    }
}

class AnnonymusInnerClass extends AnnonymusInnerClassExample {

    public String show() {
        return "calling, sms, email, camera";
    }
}

public class AnnonymusMainClass {

    public static void main(String[] args) {
        AnnonymusInnerClassExample inner = new AnnonymusInnerClassExample();
        System.out.println(inner.show());

        AnnonymusInnerClassExample inner2 = new AnnonymusInnerClass();
        System.out.println(inner2.show());

        AnnonymusInnerClassExample obj = new AnnonymusInnerClassExample(){
            public String show() {
                return "calling, sms, email, camera";
            }
        };
        obj.show();
        
        System.out.println(inner2.show());
    }
}
