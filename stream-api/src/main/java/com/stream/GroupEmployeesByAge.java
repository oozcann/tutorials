package com.stream;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByAge {
    public static void main (String[] args) {

        List<Employee> employeeList = Arrays.asList(
            new Employee(1,"Ali1",30),
            new Employee(2,"Ali2",35),
            new Employee(3,"Ali3",35),
            new Employee(4,"Ali4",45),
            new Employee(5,"Ali5",45)
        );

        // Map<Integer, List<Employee>> employeeAgeMap = employeeList.stream()
        //        .collect(Collectors.groupingBy(employee -> employee.getAge()));

        Map<Integer, List<Employee>> employeeAgeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        employeeAgeMap.forEach((key,value) -> {
            System.out.println("Age: " + key);
            System.out.println("List of Employees: " + value);
        });

    }
}
