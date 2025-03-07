package chapter5;

import java.util.ArrayList;

import Student.Student;

public class Video33 {
    public static void main(String[] args) {
        int a  = 10;
        ArrayList a1 = new ArrayList();
        ArrayList<Student> a2 = new ArrayList<Student>();
        a1.add(2);
        a1.add("Hoi dan IT");
        a1.add("Hoi dan IT2");
        a1.remove(1);
        System.out.println(a1.toString());
    }
}
