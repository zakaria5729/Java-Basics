package oopbasic1;

public class VarArgs {

    public static void main(String[] args) {
        AddDemo ob = new AddDemo();
        ob.add(10, 20);
        ob.add(10, 20, 30);
        ob.add(10, 20, 30, 40);
    }
}
