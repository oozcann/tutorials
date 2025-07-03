package com.stream.api;

import java.util.Arrays;
import java.util.List;

/**
 * mapToInt, stream’deki her öğeyi primitive int değerine dönüştürür ve sonuçta bir IntStream oluşturur.
 */
public class MapToInt {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", 20),
                new Student("Ayşe", 22),
                new Student("Mehmet", 21)
        );

        double averageAge = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();

        System.out.println("Average: " + averageAge);
    }
}

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() { return age; }
}