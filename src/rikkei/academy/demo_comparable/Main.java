package rikkei.academy.demo_comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "a", 9));
        studentList.add(new Student(2, "c",8));
        studentList.add(new Student(3, "b",10));
        studentList.add(new Student(4, "a", 4));

        Collections.sort(studentList);
        System.out.println("Sau khi sắp xếp---->"+ studentList);
    }
}
