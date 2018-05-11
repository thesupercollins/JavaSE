package com.itschool;

import com.itschool.Exceptions.IDException;
import sun.awt.SunHints;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IDException {
       /* EmployeeTimed employeeTimed = null;
        try {
            employeeTimed = new EmployeeTimed(120000000000004L, "Employee 1", 100);
            employeeTimed = new EmployeeTimed(123000000000005L, "Employee 2", 68);
            employeeTimed = new EmployeeTimed(123400000000006L, "Employee 3", 120);
            employeeTimed = new EmployeeTimed(123450000000007L, "Employee 4", 56);
        }

        catch (IDException e) {
            e.printStackTrace();
        }

        EmployeeSalaried employeeSalaried = null;
        try {
            employeeSalaried = new EmployeeSalaried(123456000000008L, "Employee 5", 8950);
            employeeSalaried = new EmployeeSalaried(123456700000009L, "Employee 6", 2450);
            employeeSalaried = new EmployeeSalaried(123456780000000L, "Employee 7", 5400);
            employeeSalaried = new EmployeeSalaried(123456789000001L, "Employee 8", 19300);
        }

        catch (IDException e) {
            e.printStackTrace();
        }*/

        System.out.println("\nСписок Timed:\n");

        ArrayList<EmployeeTimed> arrayListTimed = new ArrayList<>();

        arrayListTimed.add(new EmployeeTimed(120000000000004L, "Employee 1", 100));
        arrayListTimed.add(new EmployeeTimed(123000000000005L, "Employee 2", 68));
        arrayListTimed.add(new EmployeeTimed(123400000000006L, "Employee 3", 120));
        arrayListTimed.add(new EmployeeTimed(123450000000007L, "Employee 4", 56));

        for (EmployeeTimed element : arrayListTimed) {
            System.out.println(element.toString());
        }

        System.out.println("\nСписок Salried:\n");

        ArrayList<EmployeeSalaried> arrayListSalaried = new ArrayList<>();

        arrayListSalaried.add(new EmployeeSalaried(123456000000008L, "Employee 5", 8950));
        arrayListSalaried.add(new EmployeeSalaried(123456700000009L, "Employee 6", 2450));
        arrayListSalaried.add(new EmployeeSalaried(123456780000000L, "Employee 7", 5400));
        arrayListSalaried.add(new EmployeeSalaried(123456789000001L, "Employee 8", 19300));


        for (EmployeeSalaried element : arrayListSalaried) {
            System.out.println(element.toString());
        }


        System.out.println("\nСписок Employee:\n");


        ArrayList<Employee> arrayListEmployee = new ArrayList<>();
        arrayListEmployee.addAll(arrayListTimed);
        arrayListEmployee.addAll(arrayListSalaried);


        for (Employee element : arrayListEmployee) {
            System.out.println(element.toString());
        }

        System.out.println("\nВызов елемента по индексу: \n");

        System.out.println(arrayListEmployee.get(5));

        System.out.println("\nРазмер рписка Employee: \n");

        System.out.println(arrayListEmployee.size());

        System.out.println("\nОчистка списка Employee... ");
        arrayListEmployee.clear();
        System.out.println("\nРазмер рписка Employee: \n");
        System.out.println(arrayListEmployee.size());

        System.out.println("\nhashMapEmployee: ");

        HashMap<Object, Double> hashMapEmployee = new HashMap<Object, Double>();
        hashMapEmployee.put("Employee1", 16640.0);
        hashMapEmployee.put("Employee2", 11315.2);
        hashMapEmployee.put("Employee3", 19968.0);
        hashMapEmployee.put("Employee4", 9318.4);

        System.out.println("\nEmployee3 : " + hashMapEmployee.get("Employee3"));
        System.out.println("\nРазмер hashMapEmployee : " + hashMapEmployee.size());

        System.out.println("\nПеребор hashMapEmployee : \n");

        for (HashMap.Entry<Object, Double> entry : hashMapEmployee.entrySet()) {
            System.out.println("Работник :  " + entry.getKey() + " Зарплата : " + entry.getValue());

        }
    }
}
