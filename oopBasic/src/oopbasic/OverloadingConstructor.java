package oopbasic;

public class OverloadingConstructor {
    public static void main(String[] args) {
        consTeacher cons = new consTeacher();
        cons.displayInfo();
        
        consTeacher cons1 = new consTeacher("Zakaria", "male");
        cons1.displayInfo();
        
        consTeacher cons2 = new consTeacher("Hossain", "male", 29);
        cons2.displayInfo();
    }
}
