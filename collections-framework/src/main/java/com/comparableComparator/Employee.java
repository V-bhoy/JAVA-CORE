package com.comparableComparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Double getSalary() {
        return salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id; // sorted in ascending
    }
}