package collections_framework;

public class Student1 implements Comparable {
    
    int rollno;
    String name;
    int age;
    
    Student1(int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }
    
    @Override
    public int compareTo(Object ob) {
        Student1 s = (Student1) ob;
//        if (age == s.age) {
//            return 0;
//        } else if (age > s.age) {
//            return 1;
//        } else {
//            return -1;
//        }
        System.out.println("=======" + this.age + " compare with" + s.age);
//
//        //return s.age-this.age; //des
        return this.age-s.age;
    }
}
