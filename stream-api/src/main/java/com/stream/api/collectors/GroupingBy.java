package com.stream.api.collectors;

import java.util.List;
import java.util.stream.Collectors;

enum Gender {
    MALE,FEMALE;
}

class Employee {
    private int id;
    private Gender gender;
    private String name;

    public Employee(int id, Gender gender, String name) {
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", gender=" + gender + ", name='" + name + '\'' + '}';
    }
}

public class GroupingBy {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, Gender.MALE, "Onur Özcan"),
                new Employee(2, Gender.FEMALE, "Ayşe Öztürk"),
                new Employee(3, Gender.MALE, "Ali Özcan"),
                new Employee(4, Gender.FEMALE, "Fatma Öztürk")
        );

        employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getGender()))
                .forEach((key,value) -> {
                    System.out.println(key + " : " + value);
                });
    }
}
