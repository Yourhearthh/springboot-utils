package test;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("001", "aa"));
        list.add(new Student("002", "bb"));
        list.add(new Student("003", "cc"));
//        for (Student student : list) {
//            System.out.println(student);
//        }
        System.out.println(list);
        List<String> listSno = list.stream().map(Student::getSno).collect(Collectors.toList());
        System.out.println(listSno);

    }
}
