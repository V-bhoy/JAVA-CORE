package com.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

class Test{
    public static void main(String[] args) {
      ArrayList<Employee> employees = new ArrayList<Employee>();
      employees.add(new Employee(1, "abc", 22000.00));
      employees.add(new Employee(3, "ghi", 44000.00));
      employees.add(new Employee(2, "def", 33000.00));

      Collections.sort(employees);
      Collections.sort(employees, new EmpComparator());

      System.out.println(employees);


    }
}