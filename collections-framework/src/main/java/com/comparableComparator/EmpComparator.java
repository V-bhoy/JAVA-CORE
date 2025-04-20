package com.comparableComparator;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = Double.compare(o1.getSalary(), o2.getSalary()); // returns 1, 0, -1
        // 	•	-1 if o1.salary is less than o2.salary
        //	•	0 if equal
        //	•	1 if greater
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
