package com.itschool;

import com.itschool.Exceptions.IDException;

public class Main {

    public static void main(String[] args) {
//        EmployeeSalaried employeeSalaried = new EmployeeSalaried();
        EmployeeTimed employeeTimed = null;
        try {
            employeeTimed = new EmployeeTimed(120000000000004L, "Employee 1", 100);
        } catch (IDException e) {
            e.printStackTrace();
        }
  /*
        try {
            employeeTimed.setID(1000000L);
        } catch (IDException e) {
            e.printStackTrace();
        }
        */
        System.out.println(employeeTimed.toString());

//        System.out.println(employeeSalaried.CalculateSalary());
        System.out.println(employeeTimed.CalculateSalary());

    }
}
