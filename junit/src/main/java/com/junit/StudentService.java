package com.junit;

import com.junit.exception.StudentNotFounException;
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

    public Student findById (int id) {
        return studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Student findByName (String name) {
        return studentList.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFounException("Student not found"));
    }

}
