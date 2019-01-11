package oopbasic;

public class callByReference {

    String name;

    void change(callByReference obj1) {
        obj1.name = "Hossain";
    }
}
