package edu.cnm.deepdive;

public class DataEncapsulation {


  public static void main(String[] args) {
    Company company = new Company();
    company.setName("MyCompany");
    company.addEmployee("John");
    company.addEmployee("Anthony");
//    company.addEmployee(null);//will throw a nullPointerException because the sort() cannot sort
    //a null value.

    company.printSorted();

//    company.name = null;
//    company.printSorted();

//    company.employees = null;
//    company.employees.add("Jimmy");
//    company.printSorted();//throws a nullPointerException


  }
}
