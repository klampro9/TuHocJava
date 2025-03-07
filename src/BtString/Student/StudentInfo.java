package BtString.Student;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Tran Quang Nhat Lam", "1");
        Student st2 = new Student("Eric", "2");
        Student st3 = new Student("Bui Quach To Nhu", "3");
        Student st4 = new Student("Nguyen Bui Thien Phuoc", "4");
        Student st5 = new Student("Nguyen van Tuan", "5");
        ArrayList<Student>  arr = new ArrayList<>();
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        arr.add(st5);
        for(int i = 0; i < arr.size(); i++){
            if( arr.get(i).getName().startsWith("Nguyen")){
                System.out.println(arr.get(i));
            }
        }
    }
}
