package com.junit;

import com.junit.model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private boolean isStudentListEmpty (StudentService studentService) {
        List<Student> students = studentService.getStudents();
        return students.isEmpty();
    }
    private void addNewEmployeeToStudentList (StudentService studentService, Student student) {
        studentService.addStudent(student);
    }

    @Test
    public void testStudentService () {
        StudentService studentService = new StudentService();
        assertTrue(isStudentListEmpty(studentService),"List is not empty");
        addNewEmployeeToStudentList(studentService,new Student(1,"Ali Veli"));
        assertEquals(1,studentService.getStudents().size());
        addNewEmployeeToStudentList(studentService,new Student(2,"Ayşe Fatma"));
        assertFalse(isStudentListEmpty(studentService));
        assertTrue(isStudentListEmpty(studentService),"List is not empty!");
    }

}