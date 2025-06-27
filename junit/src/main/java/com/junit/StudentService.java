package com.junit;

import com.junit.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudents () {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

}
