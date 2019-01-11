package oopbasic1;

import java.util.LinkedList;

public class StudentListDemo {

    public static void main(String[] args) {

        StudentList s1 = new StudentList(101, "Zakaria");
        StudentList s2 = new StudentList(102, "Saharia");
        StudentList s3 = new StudentList(103, "Hasib");
        StudentList.uni = "DIU";

        LinkedList<StudentList> link = new LinkedList<>();
        link.add(s1);
        link.add(s2);
        link.add(s3);

        for (StudentList s : link) {
            System.out.println("id = " + s.id + " name = " + s.name + " uni = " + StudentList.uni);
        }
    }
}
