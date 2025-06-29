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
        assertTrue(!isStudentListEmpty(studentService),"List is not empty!");

        assertNull(studentService.findById(0),"Employee with id 0 not found.");
        addNewEmployeeToStudentList(studentService,new Student(0,"Tuna Muna"));
        assertNotNull(studentService.findById(0),"Employee with id 0 not found.");

        Student actualStudent = studentService.findById(2);

        assertEquals(2,actualStudent.getId());
        assertEquals("Ayşe Fatma",actualStudent.getName());

        assertNotEquals(1,actualStudent.getId());
        assertNotEquals("Ali Veli",actualStudent.getName());

        assertEquals(actualStudent,studentService.findById(2));



    }

}