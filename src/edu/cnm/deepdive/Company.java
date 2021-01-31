package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//these are POJO classes. By convention: a) properties or variables are private, b) getter methods
//begin with 'is' when boolean and otherwise with 'get' and c) setter methods start with 'set'.
public class Company {


    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorted() {
        System.out.println("companyName = " + name);
        Collections.sort(employees);
        System.out.println("sorted: " + employees);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("name cannot be null");
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void addEmployee(String Name) {
        if(name == null) {
            System.out.println("cannot add null for employee");
        } else {
            employees.add(name);
        }
    }
}
